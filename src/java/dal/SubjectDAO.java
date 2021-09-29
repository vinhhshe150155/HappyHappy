/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Subject;

/**
 *
 * @author Admin
 */
public class SubjectDAO extends DBContext {
    public List<Subject> getAll(){
        List<Subject> list = new ArrayList<>();
        String sql="select * from subject";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Subject s=new Subject();
                s.setSubjectID(rs.getInt("subjectID"));
                s.setSubjectName(rs.getString("subjectname"));
                s.setStatus(rs.getString("status"));
                list.add(s);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
