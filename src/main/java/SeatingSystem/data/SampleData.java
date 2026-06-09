package SeatingSystem.data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import SeatingSystem.model.GuestPreference;
import SeatingSystem.model.Reservation;
import SeatingSystem.model.Table;

public class SampleData {
	
	public static List<Table> createTables() {
		
		List<Table> tables = new ArrayList<>();
		
		tables.add(new Table("t1", 2, true, false, false));
		tables.add(new Table("t2", 6, false, true, false));
		tables.add(new Table("t3", 4, true, false, false));
		tables.add(new Table("t4", 4, false, false, true));
		tables.add(new Table("t5", 2, false, true, false));
		tables.add(new Table("t6", 6, false, false, true));
		
		return tables;
	}
	
	public static List<Reservation> createReservations() {
		
		List<Reservation> reservations = new ArrayList<>();
		
		reservations.add(new Reservation("R1", "Jack", 2, LocalDateTime.of(2026, 6, 3, 18, 0), List.of(GuestPreference.DRINKPASS)));
		reservations.add(new Reservation("R2", "Mike", 2, LocalDateTime.of(2026, 6, 3, 18, 30), List.of(GuestPreference.ELDERLY)));
		reservations.add(new Reservation("R3", "Jerry", 2, LocalDateTime.of(2026, 6, 3, 18, 30), List.of(GuestPreference.WITH_CHILD)));
		reservations.add(new Reservation("R4", "Tom", 4, LocalDateTime.of(2026, 6, 3, 18, 30), List.of(GuestPreference.DRINKPASS)));

		
		return reservations;
	}

}
