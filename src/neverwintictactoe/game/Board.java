package neverwintictactoe.game;

public class Board {
	
	private int row;
	private int column;
	protected String[][] marks;
	
	
	public Board() {		
		marks = new String[3][3];
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	public void setMark(String mark, int row, int column) {
		marks[row][column] = mark;
	}
	
	

}