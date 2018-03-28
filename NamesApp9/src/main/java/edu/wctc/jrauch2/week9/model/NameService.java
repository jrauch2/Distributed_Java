/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jrauch2.week9.model;

import edu.wctc.jrauch2.week9.data.AddressDAO;
import edu.wctc.jrauch2.week9.data.NameDAO;
import java.util.List;

/**
 *
 * @author jmbra
 */
public class NameService {
    
    
    public Name getName(String id) {
        //TODO
        return null;
    }
    
    public List<Name> getAllNames() throws Exception{
        NameDAO nameDAO = new NameDAO();
        List<Name> nameList = nameDAO.getNames();
        
        if (nameList != null) {
            AddressDAO addressDao = new AddressDAO();
            for (Name name : nameList) {
                name.setAddress(addressDao.getAddress(name));
            }
        }
        
        return nameList;
    }
    
    public List<Name> findNames(String search) {
        //TODO
        return null;
    }
        
}
