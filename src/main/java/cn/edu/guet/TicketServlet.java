package cn.edu.guet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("余票查询");
        /*
        响应JSON
        */
        String fromStation = request.getParameter("startStation");
        String toStation = request.getParameter("endStation");
        String departureDate = request.getParameter("departureDate");

        TicketSearch.search(fromStation,toStation,departureDate);

        String allTicket=TicketSearch.search(fromStation,toStation,departureDate);

        //设置响应类型
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(allTicket);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
