import cn.itcast.dao.domain.User;
import cn.itcast.dao.domain.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //设置编码
        request.setCharacterEncoding("UTF-8");

        System.out.println("我被访问了");
        //获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
    //封装user对象
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
    //调用UserDao 
        UserDao dao = new UserDao();
        User user = dao.login(loginUser);

    //判断
     if (user==null){
         //失败
         request.getRequestDispatcher("/failServlet").forward(request, response);
     }else{
         //存储
         request.setAttribute("user", user);
         request.getRequestDispatcher("/successServlet").forward(request, response);
     }
    }
}
