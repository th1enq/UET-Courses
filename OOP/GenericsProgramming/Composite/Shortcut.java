package OOP.GenericsProgramming.Composite;

public class Shortcut implements Component {
    private String name;
    private final long SIZE = 1;
    private String target; // file or folder

    Shortcut(String name, String target) {
        this.name = name;
        this.target = target;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.SIZE;
    }
}
