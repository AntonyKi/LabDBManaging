package managers;

import entities.*;
import util.DBUtil;
import util.Validator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    public static final String EXT = ".json";

    public Database createDatabase(String name, String path) throws IOException {
        Database db = new Database();
        db.name = name;
        DBUtil.write(path, db);
        return  db;
    }

    public Database getDatabase(String name, String path) throws IOException {
        return DBUtil.read(path + name + EXT);
    }

    public void addRow(Table table, List<String> rowContent, ArrayList<Column> cols){
        table.rows.add(Validator.validateRow(cols, rowContent));
    }

    public Table createTable(List<String> colNames, List<Type> types){
        ArrayList<Column> cols = new ArrayList<>();
        ArrayList<Row> rows = new ArrayList<>();
        for(int i = 0; i<colNames.size(); i++){
            Column col = new Column();
            col.setName(colNames.get(i));
            col.setType(types.get(i));
            cols.add(col);
        }
        Table table = new Table();
        table.rows = rows;
        table.cols = cols;
        return table;
    }
}
