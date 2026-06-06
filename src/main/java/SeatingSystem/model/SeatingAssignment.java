package SeatingSystem.model;

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
	
	public void print() {
		System.out.println( reservation.getReservationId() + "-->" + table);
	}
}
