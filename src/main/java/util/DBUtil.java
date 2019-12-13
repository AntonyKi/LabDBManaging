package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Column;
import entities.Database;
import entities.Table;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DBUtil {
    public static Database read(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(path), Database.class);
    }
    public static void write(String path, Database db) throws IOException {
        ObjectMapper objMapper = new ObjectMapper();
        objMapper.writeValue(new File(path), db);
    }

}
