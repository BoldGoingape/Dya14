<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2022/3/7
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>软件四班</title>
    <script>
      function sub() {
          document.getElementById("userNameMessage").innerHTML="";
          document.getElementById("passwordMessage").innerHTML="";
          // var userName=fourForm.userName.value;
          // if (userName==""){
          //     alert("请输入用户名");
          //     return false;
          // }
          var a = 0;
          if (this.form.userName.value==" "){
              document.getElementById("userNameMessage").innerHTML="请输入用户名";
              a++;
          }
          if (this.form.password.value==" "){
              document.getElementById("passwordMessage").innerHTML="请输入密码";
              a++;
          }
          if (a!=0)
              return false;
          return true;
      }
    </script>
  </head>
  <body>
  <form action="/index1Servlet" method="post"onsubmit="return sub()" name="fourForm">
    <table border="0">
      <tr>
        <td>
          用户名：
        </td>
        <td>
          <input type="text"name="userName">
        </td>
        <td id="userNameMessage">

        </td>
      </tr>
      <tr>
        <td>
          密 码：
        </td>
        <td>
          <input type="text"name="password">
        </td>
        <td id="passwordMessage">

        </td>
      </tr>
      <td>
      <input type="submit"value="提交">
      </td>
      <td>
        <input type="reset"value="取消">
      </td>
    </table>
    <%--<button>提交</button>--%>
    <%--<button>取消</button>--%>

  </form>
  </body>
</html>
