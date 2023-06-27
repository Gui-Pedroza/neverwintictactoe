package neverwintictactoe.game;

public class Display {
	
	public void printMarks(Board board) {
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

}
