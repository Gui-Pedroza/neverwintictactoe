package neverwintictactoe.game;

public class Display {
	
	public void printMarks(Board board) {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board.marks[i][j] != "X" || board.marks[i][j] != "O") {
					board.marks[i][j] = "-";
				}
				System.out.print(board.marks[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void clearScreen() { 
		 System.out.print("\033[H\033[2J"); 
		 System.out.flush(); 
	}

}
