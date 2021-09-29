/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import static java.lang.ProcessBuilder.Redirect.to;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.UserCommon;

/**
 *
 * @author Admin
 */
public class MentorDAO extends DBContext{
    public int updateImageAuthenMentor(int userID, String img1, String img2){
        String sql =  "UPDATE mentor set imgAuthen1 = ?, imgAuthen2 = ? where userID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, img1);
            ps.setString(2, img2);
            ps.setInt(3, userID);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return 0;
    }
    public int createMentor(UserCommon u){
        String sql="insert into mentor (userID) select userID from userCommon where email = ?";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setString(1, u.getEmail());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
}
