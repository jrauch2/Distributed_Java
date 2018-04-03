/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jrauch2.week9.djclassproject.data;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author jmbra
 */
public class ConnectionUtil {
    public static Connection getConnection() {
        
        DataSource ds = null;
        Connection conn = null;
        
        try {
        Context initContext = new InitialContext();
        Context webContext = (Context) initContext.lookup("java:comp/env");
        ds = (DataSource) webContext.lookup("jdbc/myProducts");
        conn = ds.getConnection();
        } catch (NamingException | SQLException e) {
            
        }
        return conn;
    }
}
