package entities;

import java.util.ArrayList;

public class Table {
    public String name;
    public ArrayList<Row> rows;
    public ArrayList<Column> cols;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Column> getCols() {
        return cols;
    }

    public void setCols(ArrayList<Column> cols) {
        this.cols = cols;
    }

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }
}
