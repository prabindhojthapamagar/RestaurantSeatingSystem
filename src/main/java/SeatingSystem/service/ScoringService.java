package SeatingSystem.service;

import SeatingSystem.model.GuestPreference;
import SeatingSystem.model.Reservation;
import SeatingSystem.model.Table;

public class ScoringService {
	
	public int calculateScore( Reservation reservation, Table table) {
		
	int score = 0;
	
	for(GuestPreference pref: reservation.getPreferences()) {
		
		switch(pref) {
		
		case ELDERLY :
			if (table.isNearBuffet()) score+=100;
			break;
		
		
		case DRINKPASS :
			if (table.isNearBar()) score+=100;
			break;
			
		case WITH_CHILD :
			if(table.isSofa()) score+=100;
			break;
		}	
	}
		
	int wastedSeat = table.getCapacity() - reservation.getPartySize();
	
	score -= wastedSeat;

	return score;
	}

}
