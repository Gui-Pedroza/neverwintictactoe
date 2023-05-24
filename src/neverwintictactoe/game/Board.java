package neverwintictactoe.game;

public class Board {
	
	private int row;
	private int column;
	private String[][] slots;
	
	private boolean positionExists(int row, int column) {
		return (row >= 0 && row <=3) || (column >= 0 && column<=3);
	}
	

}
