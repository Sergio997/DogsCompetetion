import javax.servlet.ServletException;
import java.net.URL;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLConnection;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        //doGet(req,resp);
    }

    @Override
    public void init() throws ServletException { // цей метод запускається найпершим
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Service");
        super.service(req, resp);
    }

    protected void doGet(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       // PrintWriter printWriter = response.getWriter();
       // printWriter.println("Hello");
        System.out.println("Doget");
        String s = "<html>" +
                "<header><title> This is title </title></header>"+
                "<body>"+
                "Hello world!" +
                "</body>"+
                "</html>";
        response.getWriter().write(s);
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
        super.destroy();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            new Thread() {
                @Override
                public void run() {
                    try {
                        URLConnection urlConnection = new URL("http://localhost:8080/Servlet").openConnection();
                        urlConnection.getInputStream();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }.start();
        }
    }
}
