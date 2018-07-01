/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifmt.dao;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 * @author Junior.erdmann
 */
public class Factory {

    private static DataSource con = null;
    private static final String URL = "jdbc:mysql://localhost:3306/reforco";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException {

        if (con == null) {
            MysqlConnectionPoolDataSource pool = new MysqlConnectionPoolDataSource();
            pool.setURL(URL);
            pool.setUser(USER);
            pool.setPassword(PASS);
            con = pool;
        }
        return con.getConnection();

    }

}
