package SeatingSystem.model;

public class Reservation {
	
	private String reservationId;
	private String guestName;
	private int partySize;
	
	public Reservation(String reservationId, String guestName, int partySize ) {
		
		this.reservationId = reservationId;
		this.guestName = guestName;
		this.partySize = partySize;
	}
	
	public String getReservationId() {
		return reservationId;
	}
	
	public String getGuestName() {
		return guestName;
	}
	
	public int getPartySize() {
		return partySize;
	}
}