package SeatingSystem.model;

public class Table {
	
	private String tableId;
	private int capacity;
	
	private boolean nearBuffet;
	private boolean nearBar;
	private boolean sofa;
	
	public Table( String TableId, int capacity, boolean nearBuffet, boolean nearBar, boolean sofa) {
		
		this.tableId = TableId;
		this.capacity = capacity;
		this.nearBuffet = nearBuffet;
		this.nearBar = nearBar;
		this.sofa = sofa;
		
	}
	
	public String getTableId() {
		return tableId;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public boolean isNearBuffet() {
		return nearBuffet;
	}
	
	public boolean isNearBar() {
		return nearBar;
	}
	
	public boolean isSofa() {
		return sofa;
	}
	 
	@Override
	public String toString() {
		return tableId + "(" + capacity + " seats)";
	}
} 