import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取request域中共享的对象
//        User user = (User)request.getAttribute("user");
//        if (user!=null){
//            //设置编码
//            response.setContentType("text/html;charset=utf-8");
//            response.getWriter().write("登录成功！"+user.getUsername()+",欢迎你");
//        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request, response);
    response.setContentType("text/html;charset=UTF-8");
    response.getWriter().println("汪文举");
    }
}
