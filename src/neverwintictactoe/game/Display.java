package neverwintictactoe.game;

public class Display {
	
	public void printMarks(Board board) {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board.marks[i][j] == null || (!board.marks[i][j].equals("X") && !board.marks[i][j].equals("O"))) {
				    board.marks[i][j] = "-";
				}
				System.out.print(board.marks[i][j]);
			}
			System.out.println();
		}
	}
	
	public void printEndMatch(Board board, Match match) {
		printMarks(board);
		System.out.println("Game over!");
		String winner = match.oWins(board) ? "O" : "X";
		System.out.println("Winner: " + winner);
	}
	
	public static void clearScreen() { 
		 System.out.print("\033[H\033[2J"); 
		 System.out.flush(); 
	}

}
