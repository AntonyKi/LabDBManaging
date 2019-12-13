package util;

import entities.Column;
import entities.Row;
import entities.Type;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    public static Row validateRow(ArrayList<Column> cols, List<String> rowContents){
        Row row = new Row();
        for(int i = 0;i<cols.size();i++){
            row.nodes.add(validate(rowContents.get(i), cols.get(i).type));
        }
        return row;
    }
    public static Object validate(String toValidate, Type type){
        switch(type){
            case INT:
                return Integer.parseInt(toValidate);
            case REAL:
                return Double.parseDouble(toValidate);
            case CHAR:
                return toValidate.charAt(0);
            case STRING:
                return toValidate;
            case TIME:
                return LocalTime.parse(toValidate);
            case TIMELNVL:
                return LocalDateTime.parse(toValidate);
        }
        return null;
    }
}
