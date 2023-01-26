/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drasti.java;

import java.sql.*;
/**
 *
 * @author F. Arif
 */


public class verification {
    
    public static boolean verify(String barcode, String name, String fname){
        
        String org_bar = "1234567890";
        String org_name = "Ravi Patel";
        String org_fname = "Kavi Patel";
        
        if( (barcode.equals(org_bar)) &&(name.equals(org_name)) && (fname.equals(org_fname))) {
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
    
}

