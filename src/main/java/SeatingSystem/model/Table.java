package SeatingSystem.model;

public class Table {
	
	private String tableId;
	private int capacity;
	private boolean occupied;
	
	public Table( String TableId, int capacity) {
		
		this.tableId = TableId;
		this.capacity = capacity;
		this.occupied = false;
	}
	
	public String getTableId() {
		return tableId;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	@Override
	public String toString() {
		return tableId + "(" + capacity + " seats)";
	}
} 