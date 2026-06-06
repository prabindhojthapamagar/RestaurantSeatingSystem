package SeatingSystem.data;

import java.util.ArrayList;
import java.util.List;

import SeatingSystem.model.Reservation;
import SeatingSystem.model.Table;

public class SampleData {
	
	public static List<Table> createTables() {
		
		List<Table> tables = new ArrayList<>();
		
		tables.add(new Table("t1", 2));
		tables.add(new Table("t2", 2));
		tables.add(new Table("t3", 4));
		tables.add(new Table("t4", 4));
		tables.add(new Table("t5", 6));
		tables.add(new Table("t6", 6));
		
		return tables;
	}
	
	public static List<Reservation> createReservations() {
		
		List<Reservation> reservations = new ArrayList<>();
		
		reservations.add(new Reservation("R1", "John", 2));
		reservations.add(new Reservation("R2", "Tom", 4));
		reservations.add(new Reservation("R3", "Doe", 2));
		reservations.add(new Reservation("R4", "Smith", 5));
		reservations.add(new Reservation("R5", "Jane", 3));
		
		return reservations;
	}

}
