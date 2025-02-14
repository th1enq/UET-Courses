package OOP.GenericsProgramming.Composite;

public class File implements Component {
    private String name;
    private long size;
    private String type; // binary or text

    File(String name, long size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }
}
