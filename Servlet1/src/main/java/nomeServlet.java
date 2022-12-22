import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "nomeServlet", value = "/nomeServlet")
public class nomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("nome", request.getParameter("nome"));
        session.setAttribute("cognome", request.getParameter("cognome"));
        RequestDispatcher ris = request.getRequestDispatcher("/nome.jsp");
        ris.forward(request, response);
    }
}
