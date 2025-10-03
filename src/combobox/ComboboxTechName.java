/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combobox;

import connection.MainConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Acer
 */
public class ComboboxTechName {
   private static ArrayList<String> data = new ArrayList<>();
    public static ArrayList<String> getTechName(){
           try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                
            }
          String sql = "Select Techname from Technology";
          PreparedStatement pstm = conn.prepareStatement(sql);
          ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                data.add(rs.getString("TechName"));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return data;
    }
   
    
}
