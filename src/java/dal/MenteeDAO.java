package dal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Mentee;
import model.UserCommon;

public class MenteeDAO extends DBContext{
    
    private int updateMentee(Mentee mentee){
        String sql = "  UPDATE mentees set " +
"      [name] = ?," +
"      [password] = ?," +
"      [dob] = ?," +
"      [sex] = ?," +
"      [address] = ?," +
"      [phone] = ?," +
"      [img] = ?," +
"      [description] = ?," +
"      [status] = ? where menteeID = ?";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, mentee.getName());
            ps.setString(2, mentee.getPassword());
            ps.setString(3, mentee.getDob());
            ps.setInt(4, mentee.getSex());
            ps.setString(5, mentee.getAddress());
            ps.setString(6, mentee.getPhone());
            ps.setString(7, mentee.getImg());
            ps.setString(8, mentee.getDescription());
            ps.setString(9, mentee.getStatus());
            ps.setInt(10, mentee.getMenteeID());
            return ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public int createMentee(UserCommon u){
        String sql="insert into mentee (userID) select userID from userCommon where email = ?";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setString(1, u.getEmail());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
// Test  
//    public static void main(String[] args) {
//        Mentee m = new Mentee(1, "Name", "Name", "Name", "2019-10-10", 1, "Adderess", "0102391293", "", "Des", "No", 999, "2918-12-12");
//        MenteeDAO md = new MenteeDAO();
//        md.updateMentee(m);
//    }
    
}
