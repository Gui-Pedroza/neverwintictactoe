package neverwintictactoe;

import java.util.Scanner;

import neverwintictactoe.exception.GameException;
import neverwintictactoe.game.Board;
import neverwintictactoe.game.Display;
import neverwintictactoe.game.Match;
import neverwintictactoe.model.HumanPlayer;
import neverwintictactoe.model.BotPlayer;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
				
		Match match = new Match();
		Board board = new Board();
		Display display = new Display();
		
		HumanPlayer human = new HumanPlayer();
		BotPlayer bot = new BotPlayer();
		
		System.out.println("Choose your mark: (X or O)" );
		String mark = sc.nextLine().toUpperCase();
		
		if (!mark.equals("X") && !mark.equals("O")) {
			human.setMark("X");
			bot.setMark("O");
			throw new GameException("Invalid option, your mark will be X");
			
		} else if (mark.equals("O")) {
			human.setMark("O");
			bot.setMark("X");
		} else if (mark.equals("X")) {
			human.setMark("X");
			bot.setMark("O");
		}
		
		System.out.println("To place a mark, simply type number of row and column you want to mark");
		System.out.println("For example: 12 equals first row, second column");
		
		// TODO começar a testar a marcação no tabuleiro e a lógica da exibição na tela
		
		while (!match.xWins(board) || !match.oWins(board)) {		
			Display.clearScreen();
			if (match.getTurn() % 2 == 0) {
				System.out.println("Your turn: please place your mark");
				String move = sc.nextLine();
				int row = Character.getNumericValue(move.charAt(0));
				System.out.println(row);
			}
			display.printMarks(board);
			
		}
		
	}

}
