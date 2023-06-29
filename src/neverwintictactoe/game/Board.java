package neverwintictactoe.game;

import neverwintictactoe.model.Player;

public class Board {
	
	private int row;
	private int column;
	public String[][] marks;	
	
	
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
	
	public void placeMark(Player player, int row, int column) {
		marks[row][column] = player.getMark();
	}
	
	

}