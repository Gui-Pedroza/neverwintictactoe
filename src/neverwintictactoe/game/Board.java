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
	
	public boolean isThereAMark() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (marks[i][j].equals("X") || marks[i][j].equals("O")) {
					return true;
				}
			}			
		}
		return false;
	}

}