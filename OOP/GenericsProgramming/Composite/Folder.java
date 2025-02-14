package OOP.GenericsProgramming.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private List<Component> files = new ArrayList<>();
    private String name;

    Folder(String name, List<Component> files) {
        this.name = name;
        this.files = files;
    }

    public void addComponent(Component element) {
        files.add(element);
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        long size = 0;
        for (Component element : files) {
            size += element.getSize();
        }
        return size;
    }
}
