package neverwintictactoe.model;

import neverwintictactoe.game.Board;

public class HumanPlayer extends Player {	
	
	public void placeMark(Board board, int row, int column) {
		board.marks[row][column] = this.getMark();
	}
	
}
