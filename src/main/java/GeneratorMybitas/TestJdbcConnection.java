package GeneratorMybitas;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestJdbcConnection {

    public static void main(String[] args) {

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = simpleDateFormat.format(System.currentTimeMillis());
//        System.out.println(format.split(" ")[0]);
//
//        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));
//
        Calendar cale = null;
        cale = Calendar.getInstance();
//        int year = cale.get(Calendar.YEAR);
//        int month = cale.get(Calendar.MONTH) + 1;
//
//        System.out.println(year+"-"+month);

        // 获取当月第一天和最后一天
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String firstday, lastday;
        cale.add(Calendar.DATE,1);
        firstday = format.format(cale.getTime());
        // 获取前月的最后一天
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        lastday = format.format(cale.getTime());
        System.out.println("本月第一天和最后一天分别是 ： " + firstday + " and " + lastday);



//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8", "root", "geek123456");
//            Statement statement = connection.createStatement();
//            String date = "2018-01-01";
//            String sql = "select * from demo where create_date>'"+date+"';";
//
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            while (resultSet.next()){
//
//
//                System.out.println("1111");
//            }
//
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }
}
