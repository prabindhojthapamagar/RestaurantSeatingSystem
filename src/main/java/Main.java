import SeatingSystem.service.SeatingService;
import SeatingSystem.data.SampleData;
import SeatingSystem.model.SeatingAssignment;

import java.util.List;

public class Main {

	public static void main(String[] Args) {
		
		SeatingService seatingService = new SeatingService();
		
		List<SeatingAssignment> finalAssignments = seatingService.assignSeats(SampleData.createReservations(), SampleData.createTables());
		
		for(SeatingAssignment assignment : finalAssignments) {
			assignment.print();
		}
	}
}
