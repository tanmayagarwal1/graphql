package com.uhg.gpd.ole;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;

public class MyMapper implements RowMapper<HashMap<String, Object>> {
    @Override
    public HashMap<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
        ResultSetMetaData md = rs.getMetaData();
        HashMap<String, Object> map= new HashMap<>();
        int cols = md.getColumnCount();
        for (int i = 1; i <= cols; ++i){
            map.put(md.getColumnName(i), rs.getObject(i));
        }
        return map;
    }
}
