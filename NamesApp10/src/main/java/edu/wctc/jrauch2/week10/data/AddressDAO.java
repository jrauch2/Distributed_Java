/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jrauch2.week10.data;

import edu.wctc.jrauch2.week10.model.Address;
import edu.wctc.jrauch2.week10.model.Name;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author jmbra
 */
public class AddressDAO {
    
    public Address getAddress(Name name) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Address address = null;
        
        try {
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from address where nameid = ?");
            stmt.setString(1, name.getId());
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                String id = rs.getString("id");
                String street = rs.getString("street");
                String city = rs.getString("city");
                String state = rs.getString("state");
                String zip = rs.getString("zip");
                
                address = new Address(street, city, state, zip);
            }
                
            return address;
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    }
}
    

