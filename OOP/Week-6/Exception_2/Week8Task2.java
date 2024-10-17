import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    public static void nullPointerEx() {
        throw new NullPointerException();
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public static String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    public static void arrayIndexOutOfBoundsEx() {
        int[] arr = new int[3];
        int x = arr[10];
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public static String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (Exception e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    public static void arithmeticEx() {
        int result = 33 / 0;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public static String arithmeticExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (Exception e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public static void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public static String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (Exception e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    public static void ioEx() throws IOException {
        throw new IOException("Here");
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public static String ioExTest() {
        try {
            ioEx();
        } catch (Exception e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }

    public static void main(String[] args) {
        System.out.println(Week8Task2.ioExTest());
    }
}
