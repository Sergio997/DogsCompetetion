import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

@WebServlet("/temp")
public class URLParam extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String one = request.getParameter("one");
        String two = request.getParameter("two");
        System.out.println("one = " +one);

        response.getWriter().write("<html>"+
                "<head></head>" +
                "<body>" +
                "one = "+one+
                "two = " +two+
                "<form action='temp' method='post'>"+
                "<input type='text' name='one'/>" +
                "<input type='text' name='two'/>" +
                "<input type='submit' name='submit'/>" +
                "</form>"+
                "</body>" +
                "</html>");

        /*ArrayList<String[]> ones = new ArrayList<>();
        ones.add(request.getParameterValues("one"));
        for(int i = 0; i < ones.size(); i++){
            System.out.println(ones.get(i).toString());
        }*/
        /*String[] ones = request.getParameterValues("one");
        for(String s : ones){
            System.out.println(s);
        }*/
        /*Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String elementName = parameterNames.nextElement();
            System.out.println(elementName +" = " +request.getParameter(elementName));
        }*/

    }
}
