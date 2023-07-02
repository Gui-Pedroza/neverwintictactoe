package neverwintictactoe.game;

import neverwintictactoe.exception.GameException;
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
		if (isThereAMark(row, column)) {
			throw new GameException("There's already a mark, chose another grid");
		}
		marks[row-1][column-1] = player.getMark();
	}
	
	public boolean isThereAMark(int row, int column) {
		return marks[row-1][column-1].equals("X") || marks[row-1][column-1].equals("O");
	}
	
	public boolean positionExists(int row, int column) {
		return (row < 1 && row > 3) || (column < 1 && column > 3); 
	}

}