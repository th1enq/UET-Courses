public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * haha.
     *
     * @param coordinatesX hihi
     * @param coordinatesY hihi
     */
    public Piece(int coordinatesX, int coordinatesY) {
        if (checkValidCoordinates(coordinatesX, coordinatesY)) {
            this.coordinatesX = coordinatesX;
            this.coordinatesY = coordinatesY;
        }
        this.color = "white";
    }

    /**
     * haha.
     *
     * @param coordinatesX hihi
     * @param coordinatesY hihi
     * @param color hihi
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        if (checkValidCoordinates(coordinatesX, coordinatesY)) {
            this.coordinatesX = coordinatesX;
            this.coordinatesY = coordinatesY;
        }
        if (checkValidColor(color)) {
            this.color = color;
        } else {
            this.color = "white";
        }
    }

    /**
     * haha.
     *
     * @param coordinatesX hihi
     * @param coordinatesY hihi
     * @return hihi
     */
    public static boolean checkValidCoordinates(int coordinatesX, int coordinatesY) {
        return coordinatesX >= 1 && coordinatesX <= 8 && coordinatesY >= 1 && coordinatesY <= 8;
    }

    /**
     * haha.
     *
     * @param color hihi
     * @return hihi
     */
    public static boolean checkValidColor(String color) {
        return color.equals("white") || color.equals("black");
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);

    /**
     * haha.
     *
     * @return hihi
     */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    /**
     * haha.
     *
     * @param coordinatesX hihi
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * haha.
     *
     * @param coordinatesY hihi
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getColor() {
        return color;
    }

    /**
     * haha.
     *
     * @param color hihi
     */
    public void setColor(String color) {
        if (checkValidColor(color)) {
            this.color = color;
        }
    }

    /**
     * haha.
     *
     * @param p hihi
     * @return
     */
    public boolean checkPosition(Piece p) {
        if (!checkValidCoordinates(p.getCoordinatesX(), p.getCoordinatesY())) {
            return false;
        }
        return p.getCoordinatesX() == this.coordinatesX && p.getCoordinatesY() == this.coordinatesY;
    }
}
