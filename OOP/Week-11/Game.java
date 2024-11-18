import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    /**
     * haha.
     */
    public Game() {
        board = new Board();
        moveHistory = new ArrayList<>();
    }

    /**
     * haha.
     *
     * @param board hihi
     */
    public Game(Board board) {
        this.board = board;
        moveHistory = new ArrayList<>();
    }

    /**
     * haha.
     *
     * @param piece hihi
     * @param x hihi
     * @param y hihi
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Move move;
            Piece killedPiece = board.getAt(x, y);
            if (killedPiece != null) {
                move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece,
                        killedPiece);
                board.removeAt(x, y);
            } else {
                move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);
            }
            moveHistory.add(move);
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public Board getBoard() {
        return board;
    }

    /**
     * haha.
     *
     * @param board hihi
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
