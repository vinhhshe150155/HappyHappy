package dal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.AuthenticationCode;
import model.Mentor;
public class AuthenticationCodeDAO extends DBContext{
        public AuthenticationCode getAuthenCodeByEmail(String email){
        String sql = "SELECT TOP 1 * from authenticationCode where email=? order by createTime desc";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                AuthenticationCode ac = new AuthenticationCode(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                return ac;
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public int insertCodeAuthentication(String email, String code){
        String sql = "INSERT INTO authenticationCode(email, code) values (?, ?)";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, code);
            return ps.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public static void main(String[] args) {
        AuthenticationCodeDAO acd  = new AuthenticationCodeDAO();
        System.out.println(acd.getAuthenCodeByEmail("vinhhshe150155@fpt.edu.vn").getCode());
    }
   
}
