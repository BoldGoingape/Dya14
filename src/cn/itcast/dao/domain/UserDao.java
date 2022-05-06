package cn.itcast.dao.domain;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

    //声明jdbcTemplate对象
        private JdbcTemplate template = new JdbcTemplate(JDBCUtis.getDataSource());
    /*
* 登录方法
* 操作数据库
* */
    public User login(User loginUser){
        //1.
        try {
            String sql = "select * from user where username = ? and password =?";

            User user=template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(),loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
