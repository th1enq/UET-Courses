public class Rook extends Piece {
    /**
     * haha.
     *
     * @param x hihi
     * @param y hihi
     */
    public Rook(int x, int y) {
        super(x, y);
    }

    /**
     * haha.
     *
     * @param x hihi
     * @param y hihi
     * @param color hihi
     */
    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y) || isInvalidRookMove(x, y)) {
            return false;
        }

        Piece pieceAt = board.getAt(x, y);
        if (pieceAt != null && pieceAt.getColor().equals(this.getColor())) {
            return false;
        }

        return (this.getCoordinatesX() == x) ? canMoveX(board, x, y) : canMoveY(board, x, y);
    }

    /**
     * haha.
     *
     * @param board hihi
     * @param x hihi
     * @param y hihi
     * @return hihi
     */
    public boolean canMoveX(Board board, int x, int y) {
        int min = Math.min(this.getCoordinatesY(), y);
        int max = Math.max(this.getCoordinatesY(), y);

        for (int i = min + 1; i < max; i++) {
            if (board.getAt(x, i) != null) {
                return false;
            }
        }

        return true;
    }

    /**
     * haha.
     *
     * @param board hihi
     * @param x hihi
     * @param y hihi
     * @return hihi
     */
    public boolean canMoveY(Board board, int x, int y) {
        int min = Math.min(this.getCoordinatesX(), x);
        int max = Math.max(this.getCoordinatesX(), x);

        for (int i = min + 1; i < max; i++) {
            if (board.getAt(i, y) != null) {
                return false;
            }
        }

        return true;
    }

    /**
     * haha.
     *
     * @param x hihi
     * @param y hihi
     * @return hihi
     */
    public boolean isInvalidRookMove(int x, int y) {
        return (x != this.getCoordinatesX() && y != this.getCoordinatesY())
                || (x == this.getCoordinatesX() && y == this.getCoordinatesY());
    }
}
