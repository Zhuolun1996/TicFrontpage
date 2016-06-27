package register.control;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import register.info.*;
import java.sql.*;

/**
 * Servlet implementation class HandleRegister
 */
@WebServlet("/RegistControl")
public class HandleRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public HandleRegister() {
//        super();
        // TODO Auto-generated constructor stub
//    }
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e){}
	}
		
	public String handleString(String s){
		try{
			byte bb[]=s.getBytes("UTF-8");
			s=new String(bb);
		}
		catch(Exception ee){}
		return s;
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con;
		Statement sql;
		Register reg=new Register();
		request.setAttribute("register",reg);
		String name=request.getParameter("name").trim();
		String number=request.getParameter("number").trim();
		String sex=request.getParameter("sex").trim();
		String ascription=request.getParameter("ascription").trim();
		String major=request.getParameter("major").trim();
		String phone=request.getParameter("phone").trim();
		String email=request.getParameter("email").trim();
		String apartmenttemp[]=request.getParameterValues("apartment");
		String message=request.getParameter("message").trim();
		String apartment="";
		String url="jdbc:mysql://localhost:3306/Register";
		if(name==null){
			name="";
		}
		if(number==null){
			number="";
		}
		for(int i=0;i<apartmenttemp.length;i++){
			apartment+=apartmenttemp[i]+" ";
		}
		boolean boo=name.length()>0&&number.length()>0;
		String backNews="";
		try{
			con=DriverManager.getConnection(url,"root","asdfgH11");
			String insertCondition="INSERT INTO register VALUES('"+name+"','"+number+"','"+ascription+"','"+major+"','"+sex+"','"+phone+"','"+email+"','"+apartment+"','"+message+"')";
			sql=con.createStatement();
			if(boo){
				int m=sql.executeUpdate(insertCondition);
				if(m!=0){
					backNews="注册成功";
					reg.setBackNews(backNews);
					reg.setName(name);
					reg.setNumber(number);
					reg.setSex(sex);
					reg.setAscription(ascription);
					reg.setMajor(major);
					reg.setPhone(phone);
					reg.setEmail(email);
					reg.setApartment(apartment);
					reg.setMessage(message);
				}
			}
			else{
				backNews="信息填写不完整或名字中有非法字符";
				reg.setBackNews(backNews);
			}
			con.close();
		}
		catch(Exception exp){
			backNews="报名失败"+exp;
			reg.setBackNews(backNews);
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("/showRegister.jsp");
		dispatcher.forward(request,response);
	}

}
