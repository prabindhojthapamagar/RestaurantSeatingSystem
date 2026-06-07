package SeatingSystem.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SeatingAssignment {
	
	private Reservation reservation;
	private Table table;

	public SeatingAssignment(Reservation reservation, Table table) {
		
		this.reservation = reservation;
		this.table = table;
	}

	public Reservation getReservation() {
		return reservation;
	}
	
	public Table getTable() {
		return table;
	}
	
	public LocalDateTime getStartTime() {
		return reservation.getArrivalTime();
	}
	
	public LocalDateTime getEndTime() {
		return reservation.getDepartureTime();
	}
	
	public void print() {
		System.out.println( reservation.getReservationId() + "-->" + table + " || " + getStartTime().format(DateTimeFormatter.ofPattern("hh:mm")) + " - " + getEndTime().format(DateTimeFormatter.ofPattern("hh:mm")));
	}
}
