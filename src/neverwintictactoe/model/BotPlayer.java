package neverwintictactoe.model;

import neverwintictactoe.game.Board;

public class BotPlayer extends Player {
	
	public void placeMark(Board board, int row, int column) {
		board.marks[row][column] = this.getMark();
		// TODO : toda a lógica da marcação do bot
	}

}
