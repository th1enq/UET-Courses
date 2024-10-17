import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Layer {
    private List<Shape> shapes = new LinkedList<>();

    /**
     * haha.
     *
     * @param shape hihi
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getInfo() {
        StringBuilder result = new StringBuilder("Layer of crazy shapes:");
        result.append("\n");
        for (Shape shape : shapes) {
            result.append(shape.toString());
            result.append("\n");
        }
        return result.toString();
    }

    /**
     * haha.
     */
    public void removeDuplicates() {
        Set<Shape> notDuplicated = new LinkedHashSet<>();
        notDuplicated.addAll(shapes);
        shapes.clear();
        shapes.addAll(notDuplicated);
    }
}
