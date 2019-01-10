import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cook")
public class MyCookies extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String one = request.getParameter("username");
        String two = request.getParameter("password");

        System.out.println(one);

        /*response.getWriter().write("<html>"+
                "<head></head>" +
                "<body>" +
                "<form action='cook' method='post'>"+
                "<input type='text' name='one'/>" +
                "<input type='text' name='two'/>" +
                "<input type='submit' name='submit'/>" +
                "</form>"+
                "</body>" +
                "</html>");*/
        /*response.setContentType("text/html");
        Cookie cookie = new Cookie(one,two);
        response.addCookie(cookie);
        Cookie[] cookies = request.getCookies();

        for(Cookie cookie1: cookies){
            System.out.println(cookie1.getName());
            System.out.println(cookie1.getValue());
        }*/
    }
}
