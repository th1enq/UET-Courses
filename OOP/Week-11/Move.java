public class Move {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * haha.
     *
     * @param startX hihi
     * @param endX hihi
     * @param startY hihi
     * @param endY hihi
     * @param movedPiece hihi
     * @param killedPiece hihi
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * haha.
     *
     * @param startX hihi
     * @param endX hihi
     * @param startY hihi
     * @param endY hihi
     * @param movedPiece hihi
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public int getStartX() {
        return startX;
    }

    /**
     * haha.
     *
     * @param startX hihi
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public int getStartY() {
        return startY;
    }

    /**
     * haha.
     *
     * @param startY hihi
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public int getEndX() {
        return endX;
    }

    /**
     * haha.
     *
     * @param endX hihi
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public int getEndY() {
        return endY;
    }

    /**
     * haha.
     *
     * @param endY hihi
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public Piece getMovedPiece() {
        return movedPiece;
    }

    /**
     * haha.
     *
     * @param movedPiece hihi
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public Piece getKilledPiece() {
        return killedPiece;
    }

    /**
     * haha.
     *
     * @param killedPiece hihi
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String toString() {
        return movedPiece.getColor() + "-" + movedPiece.getSymbol() + (char) ('a' + endX - 1)
                + endY;
    }
}
