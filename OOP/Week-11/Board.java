import java.lang.reflect.Array;
import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    public Board() {
        this.pieces = new ArrayList<>();
    }

    /**
     * haha.
     *
     * @param piece hihi
     */
    public void addPiece(Piece piece) {
        if (getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            pieces.add(piece);
        }
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * haha.
     *
     * @param pieces hihi
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    /**
     * haha.
     *
     * @param x hihi
     * @param y hihi
     * @return hihi
     */
    public boolean validate(int x, int y) {
        return Piece.checkValidCoordinates(x, y);
    }

    /**
     * haha.
     *
     * @param x hihi
     * @param y hihi
     * @return hihi
     */
    public Piece getAt(int x, int y) {
        if (Piece.checkValidCoordinates(x, y)) {
            for (Piece piece : pieces) {
                if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                    return piece;
                }
            }
        }
        return null;
    }

    /**
     * haha.
     *
     * @param x hihi
     * @param y hihi
     */
    public void removeAt(int x, int y) {
        if (Piece.checkValidCoordinates(x, y)) {
            pieces.remove(getAt(x, y));
        }
    }
}
