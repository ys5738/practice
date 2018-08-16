package ldes.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ATestDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertIntoA(String name){
        jdbcTemplate.execute("Insert INTO A(name) VALUE (\"" + name + "\")");
    }
}
