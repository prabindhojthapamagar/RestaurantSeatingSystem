package SeatingSystem.model;

public class Table {
	
	private String tableId;
	private int capacity;
	
	public Table( String TableId, int capacity) {
		
		this.tableId = TableId;
		this.capacity = capacity;
		
	}
	
	public String getTableId() {
		return tableId;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	
	@Override
	public String toString() {
		return tableId + "(" + capacity + " seats)";
	}
} 