package com.uhg.gpd.ole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class oleService {
    @Autowired
    @Qualifier("jdbcTemplate1")
    JdbcTemplate template;

    public ArrayList<HashMap<String, Object>> getOleData(){
        String query = "select * from ole";
        ArrayList<HashMap<String, Object>> list = new ArrayList<>(template.query(query, new MyMapper()));
        return list;
    }

    public ArrayList<HashMap<String, Object>> getWithTime(String time) {
        String query = "select * from ole where creation_date = ?";
        ArrayList<HashMap<String, Object>> list = new ArrayList<>(template.query(query, new MyMapper(), time));
        return list;
    }
}
