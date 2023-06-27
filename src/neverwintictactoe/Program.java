package neverwintictactoe;

import neverwintictactoe.game.Board;
import neverwintictactoe.game.Display;
import neverwintictactoe.game.Match;
import neverwintictactoe.model.HumanPlayer;

public class Program {

	public static void main(String[] args) {
		
		HumanPlayer human = new HumanPlayer("X");
		
		Match match = new Match();
		Board board = new Board();
		Display display = new Display();
		
		while (!match.xWins(board) || !match.oWins(board)) {
			display.printMarks(board);
		}
		
	}

}
