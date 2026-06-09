package SeatingSystem.model;

import java.time.LocalDateTime;
import java.util.List;

public class Reservation {
	
	private String reservationId;
	private String guestName;
	private int partySize;
	private LocalDateTime arrivalTime;
	private List<GuestPreference> preferences;
	
	public Reservation(String reservationId, String guestName, int partySize, LocalDateTime arrivalTime, List<GuestPreference> preferences ) {
		
		this.reservationId = reservationId;
		this.guestName = guestName;
		this.partySize = partySize;
		this.arrivalTime = arrivalTime;
		this.preferences = preferences;
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
	
	public List<GuestPreference> getPreferences() {
		return preferences;
	}
}