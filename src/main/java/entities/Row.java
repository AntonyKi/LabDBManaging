package entities;

import java.util.ArrayList;

public class Row {
    public ArrayList<Object> nodes;
    public int type;

    public ArrayList<Object> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Object> nodes) {
        this.nodes = nodes;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
