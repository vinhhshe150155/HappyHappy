/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.userCommon;


/**
 *
 * @author Admin
 */
public class userDAO extends DBContext {
    public userCommon getAccount(String email, String password){
        String sql="select * from userCommon where email=? and password=?";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setString(1, email);
            st.setString(2, password);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new userCommon(rs.getInt("userID"),
                                    rs.getString("name"),
                                    rs.getString("password"),
                                    rs.getString("email"),
                                    rs.getString("dob"),
                                    rs.getInt("sex"),
                                    rs.getString("address"),
                                    rs.getString("phone"),
                                    rs.getString("imgAvt"),
                                    rs.getString("description"),
                                    rs.getString("status"),
                                    rs.getInt("moneyLeft"),
                                    rs.getDate("createTime"),
                                    rs.getInt("role"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;    
    }
    
    public userCommon getEmail(String email){
        String sql="select * from userCommon where email=?";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setString(1, email);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new userCommon(rs.getInt("userID"),
                                    rs.getString("name"),
                                    rs.getString("password"),
                                    rs.getString("email"),
                                    rs.getString("dob"),
                                    rs.getInt("sex"),
                                    rs.getString("address"),
                                    rs.getString("phone"),
                                    rs.getString("imgAvt"),
                                    rs.getString("description"),
                                    rs.getString("status"),
                                    rs.getInt("moneyLeft"),
                                    rs.getDate("createTime"),
                                    rs.getInt("role"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public userCommon getPhone(String phone){
        String sql="select * from userCommon where phone=?";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setString(1, phone);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new userCommon(rs.getInt("userID"),
                                    rs.getString("name"),
                                    rs.getString("password"),
                                    rs.getString("email"),
                                    rs.getString("dob"),
                                    rs.getInt("sex"),
                                    rs.getString("address"),
                                    rs.getString("phone"),
                                    rs.getString("imgAvt"),
                                    rs.getString("description"),
                                    rs.getString("status"),
                                    rs.getInt("moneyLeft"),
                                    rs.getDate("createTime"),
                                    rs.getInt("role"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public int create(userCommon a){
        String sql="insert into userCommon(name,password,email,dob,sex,address,phone,role) values (?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setNString(1, a.getName());
            st.setString(2, a.getPassword());
            st.setString(3, a.getEmail());
            st.setString(4, a.getDob());
            st.setInt(5, a.getSex());
            st.setString(6, a.getAddress());
            st.setString(7, a.getPhone());
            st.setInt(8, a.getRole());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
}
