package user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import business.User;



public class NewCustomerServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
       
        
        String url = "/New_Customer.jsp";
        
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  
        }
        
        
        if (action.equals("join")) {
            url = "/New_Customer.jsp";    
        } 
        else if (action.equals("add")) {
            
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String num = request.getParameter("num");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zipcode = request.getParameter("zipCode");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            

            
            User user = new User(firstName, lastName, email, num, address, city,
                    state, zipcode, username, password);

            
            session.setAttribute("user", user);
           
           // Created a new user in the servlet with a lastname and zipcode for name
           // user temporary password of welcome1
            
            User user2 = new User();
            user2.setUsername("smith343668");
            user2.setPassword("welcome1");
            
            
            String message;
            if (firstName == null || lastName == null || email == null || num == null || num.isEmpty() || 
                    firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
                message = "Please fill out all boxes properly.";
                url = "/New_Customer.jsp";
            } 
            else {
                message = null;
                url = "/success.jsp";
                
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
      
        
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }  
    
}