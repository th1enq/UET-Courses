package OOP.GenericsProgramming.Composite;

import java.util.ArrayList;
import java.util.List;

public class Disk {
    private List<Component> child = new ArrayList<>();
    private String name;
    private long size;
    private long freeSpace;

    public String getName() {
        return this.name;
    }

    public long getFreeSpace() {
        long usedSize = 0;
        for (Component elementComponent : child) {
            usedSize += elementComponent.getSize();
        }
        return size - usedSize;
    }
}
