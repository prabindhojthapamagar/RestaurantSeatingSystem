package SeatingSystem.service;

import SeatingSystem.model.Reservation;
import SeatingSystem.model.SeatingAssignment;
import SeatingSystem.model.Table;

import java.util.ArrayList;
import java.util.List;

public class SeatingService {
	

	public List<SeatingAssignment> assignSeats( List<Reservation> reservations, List<Table> tables) {
		
		List<SeatingAssignment> assignments = new ArrayList<>();
		
		for (Reservation reservation : reservations) {
			Table selectedTable = null;
			
			for (Table table : tables) {
				
				if(!table.isOccupied() && reservation.getPartySize() <= table.getCapacity()) {
					
					if(selectedTable == null || table.getCapacity() < selectedTable.getCapacity()) {
						selectedTable = table;
					}
				}
			}
			
			if(selectedTable != null) {
				
				selectedTable.setOccupied(true);
				
				assignments.add(new SeatingAssignment(reservation, selectedTable));				
			}
		}
		
		return assignments;
	}

}
