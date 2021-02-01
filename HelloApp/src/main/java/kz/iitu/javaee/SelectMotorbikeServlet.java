package kz.iitu.javaee;

import kz.iitu.javaee.model.MotorbikeType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "SelectMotorbikeServlet",
        urlPatterns = "/SelectMotorType"
)
public class SelectMotorbikeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String motorbikeType = req.getParameter("motorType");

        MotorbikeService motorbikeService = new MotorbikeService();
        MotorbikeType typeMotorEnum = MotorbikeType.valueOf(motorbikeType);

        List motorbikeBrands = motorbikeService.getAvailableBrands(typeMotorEnum);

        req.setAttribute("brands", motorbikeBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
