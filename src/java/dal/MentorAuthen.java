package dal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Mentor;

public class MentorAuthen extends DBContext{
    private int updateMentor(Mentor mentor){
        String sql = "UPDATE mentors set authen = 1 where mentorID = " + mentor.getMentorID();
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            return ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    
}
