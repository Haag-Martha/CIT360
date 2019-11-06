package CompanyLogin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CompanyLogin extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse  res)throws ServletException, IOException
	{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			
			String user=req.getParameter("userName");
			String pass=req.getParameter("password");
			pw.println("You have successfuly loggedIn!");
			
			if(user.equals("bobbityboo") && pass.equals("bobbityboo"))
				pw.println("You have successfuly Logged In!");
			else
				pw.println("Sorry! Login not successful");
			pw.close();
				
		}

	}