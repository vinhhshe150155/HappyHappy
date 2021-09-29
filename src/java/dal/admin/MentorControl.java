package dal.admin;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Mentor;

public class MentorControl extends DBContext {

    public List<Mentor> getListMentor() {
        List<Mentor> list = new ArrayList();
        String sql = "SELECT TOP 100 * FROM userCommon u inner join mentor m on u.userID = m.userID";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
//            public Mentor(int mentorID, String name, String password, String email, String dob, int sex, String education, int yearExperiment, String address, String phone, String intro, String imgAvt, String imgAuthen1, String imgAuthen2, String description, int authen, String status, int moneyLeft, String createTime)
            while (rs.next()) {
                Mentor mentor = new Mentor();
                mentor.setMentorID(rs.getInt(1));
                mentor.setName(rs.getString(2));
                mentor.setPassword(rs.getString(3));
                mentor.setEmail(rs.getString(4));
                mentor.setDob(rs.getString(5));
                mentor.setSex(rs.getInt(6));
                mentor.setAddress(rs.getString(7));
                mentor.setPhone(rs.getString(8));
                mentor.setImgAvt(rs.getString(9));
                mentor.setDescription(rs.getString(10));
                mentor.setStatus(rs.getString(11));
                mentor.setMoneyLeft(rs.getInt(12));
                mentor.setCreateTime(rs.getString(13));
                mentor.setEducation(rs.getString(16));
                mentor.setYearExperiment(rs.getInt(17));
                mentor.setIntro(rs.getString(18));
                mentor.setImgAuthen1(rs.getString(19));
                mentor.setImgAuthen2(rs.getString(20));
                mentor.setAuthen(rs.getInt(21));
                list.add(mentor);
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        MentorControl mc = new MentorControl();
        System.out.println(mc.getListMentor().get(0).getImgAuthen1());
    }
}
