package MyControl;

import myjsp.MyModel;
import myjsp.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Controler")
public class Servlet extends HttpServlet {
    MyModel myModel = new MyModel();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person person = myModel.getPerson();
        request.setAttribute("Person",person);
        //request.getSession().setAttribute("Person",person);
        //request.getServletContext().setAttribute("Petson",person);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/MyJSP/MyView.jsp");
        requestDispatcher.forward(request,response);
    }
}
