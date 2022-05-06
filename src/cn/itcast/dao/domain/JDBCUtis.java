package cn.itcast.dao.domain;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//import javax.activation.DataSource;
/*
* jdbc工具类，使用Durid 连接池
* */
public class JDBCUtis {
    private static DataSource ds;
    static {
        try {
        //加载和初始化
        Properties pro = new Properties();
        InputStream is = JDBCUtis.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            //初始化
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * 获取连接池对象
    * */
    public static DataSource getDataSource(){
        return ds;
    }
    /*
    * 获取连接Connection对象
    * */
   public static Connection getConnection() throws SQLException {
       return ds.getConnection();
   }
}
