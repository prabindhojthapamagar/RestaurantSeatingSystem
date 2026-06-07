package SeatingSystem.model;

import java.time.LocalDateTime;

public class Reservation {
	
	private String reservationId;
	private String guestName;
	private int partySize;
	private LocalDateTime arrivalTime;
	
	public Reservation(String reservationId, String guestName, int partySize, LocalDateTime arrivalTime ) {
		
		this.reservationId = reservationId;
		this.guestName = guestName;
		this.partySize = partySize;
		this.arrivalTime = arrivalTime;
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
	
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	
	public LocalDateTime getDepartureTime() {
		return arrivalTime.plusMinutes(90);
	}
}