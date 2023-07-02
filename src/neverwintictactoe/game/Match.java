package neverwintictactoe.game;

public class Match {	
	
	private static final String x = "X";
	private static final String o = "O";
	private int turn;
	
	// são 8 condicões de vitória
	
	public int getTurn() { return this.turn; }
	
	
	public boolean xWins(Board board) {
		// verifica vitória em linhas
		if ((board.marks[0][0] == x && board.marks[0][1] == x && board.marks[0][2] == x) ||
				(board.marks[1][0] == x && board.marks[1][1] == x && board.marks[1][2] == x) ||
				(board.marks[2][0] == x && board.marks[2][1] == x && board.marks[2][2] == x)) {
			return true;
		// verifica a vitória em colunas	
		} else if ((board.marks[0][0] == x && board.marks[1][0] == x && board.marks[2][0] == x) ||
				(board.marks[0][1] == x && board.marks[1][1] == x && board.marks[1][2] == x) ||
				(board.marks[0][2] == x && board.marks[1][2] == x && board.marks[2][2] == x)) {
			return true;
		// verifica a vitória em diagonais
		} else if ((board.marks[0][0] == x && board.marks[1][1] == x && board.marks[2][2] == x) ||
			(board.marks[0][2] == x && board.marks[1][1] == x && board.marks[2][0] == x)) {
			return true;
		}
		return false;
	}
	
	public boolean oWins(Board board) {
		// verifica vitória em linhas
		if ((board.marks[0][0] == o && board.marks[0][1] == o && board.marks[0][2] == o) ||
				(board.marks[1][0] == x && board.marks[1][1] == x && board.marks[1][2] == o) ||
				(board.marks[2][0] == o && board.marks[2][1] == o && board.marks[2][2] == o)) {
			return true;
		// verifica a vitória em colunas	
		} else if ((board.marks[0][0] == o && board.marks[1][0] == o && board.marks[2][0] == o) ||
				(board.marks[0][1] == o && board.marks[1][1] == o && board.marks[1][2] == o) ||
				(board.marks[0][2] == o && board.marks[1][2] == o && board.marks[2][2] == o)) {
			return true;
		// verifica a vitória em diagonais
		} else if ((board.marks[0][0] == o && board.marks[1][1] == o && board.marks[2][2] == o) ||
			(board.marks[0][2] == o && board.marks[1][1] == o && board.marks[2][0] == o)) {
			return true;
		}
		return false;
	}
	
	public void nextTurn() { this.turn++; }
				
}
