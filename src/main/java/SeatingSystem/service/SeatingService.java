package SeatingSystem.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import SeatingSystem.model.Reservation;
import SeatingSystem.model.SeatingAssignment;
import SeatingSystem.model.Table;

public class SeatingService {
	

	public List<SeatingAssignment> assignSeats( List<Reservation> reservations, List<Table> tables) {
		
		List<SeatingAssignment> assignments = new ArrayList<>();
		ScoringService scoringService = new ScoringService();
		
		reservations.sort(Comparator.comparing(Reservation::getArrivalTime));
		
		
		
		for (Reservation reservation : reservations ) {
			
			int bestScore = -1;
			Table selectedTable = null;

			
			
			for( Table table : tables) {
				
				int score = scoringService.calculateScore(reservation, table);
				
				if(tableAvailable(table, reservation, assignments)) {
					
					if(table.getCapacity() >= reservation.getPartySize()) {
						
						
						if(selectedTable == null || score > bestScore) {
							
							selectedTable = table;
							bestScore = score;
							
						}
					}
				}
				
		
			}
			
			if (selectedTable != null) {
				assignments.add(new SeatingAssignment(reservation, selectedTable));
			}
			
		}
		
		return assignments;
	}
	
	private boolean tableAvailable( Table table, Reservation reservation, List<SeatingAssignment> assignments) {
		
		for (SeatingAssignment assignment : assignments) {
			
			if ( !assignment.getTable().getTableId().equals(table.getTableId())) {
				
				continue;
			}
			
			boolean overlap = reservation.getArrivalTime().isBefore(assignment.getEndTime()) 
					&& reservation.getDepartureTime().isAfter(assignment.getStartTime());
			
			if (overlap) {
				return false;
			}
		}
		return true;
	}

}
