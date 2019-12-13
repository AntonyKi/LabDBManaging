package managers;

import entities.Column;
import entities.Database;
import util.DBUtil;

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

    public Database addRow(String dbname, List<String> rowContent, ArrayList<Column> cols){
        return
    }
}
