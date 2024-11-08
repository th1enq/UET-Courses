import java.util.List;

public class ShapeUtil {
    /**
     * haha.
     *
     * @param shapes hihi
     * @return hihi
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder circle = new StringBuilder("Circle:\n");
        StringBuilder triangle = new StringBuilder("Triangle:\n");

        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                circle.append(shape.getInfo());
                circle.append("\n");
            } else if (shape instanceof Triangle) {
                triangle.append(shape.getInfo());
                triangle.append("\n");
            }
        }

        return circle.toString() + triangle.toString();
    }
}
