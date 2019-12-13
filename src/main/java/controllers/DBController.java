package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DBController {
    @RequestMapping("/databases")
    public ArrayList<String> getDatabases(){

    }
    @RequestMapping("/databases/{databaseName}/tables")
    public ArrayList<String> getTables(){

    }
    @RequestMapping("/databases/{databaseName}/tables/{tableName}")
    public ArrayList<String> getTableContents(){

    }
}
