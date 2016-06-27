package register.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import register.info.*;
import com.sun.rowset.*;
import java.sql.*;

/**
 * Servlet implementation class HandleDatabase
 */
@WebServlet("/helpShowRegisters")
public class HandleShowRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public HandleDatabase() {
//        super();
        // TODO Auto-generated constructor stub
//    }
	CachedRowSetImpl rowSet=null;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e){
			
		}
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(true);
		Connection con=null;
		StringBuffer presentPageResult=new StringBuffer();
		showPage showBean=null;
		try{
			showBean=(showPage)session.getAttribute("showpage");
			if(showBean==null){
				showBean=new showPage();
				session.setAttribute("showpage", showBean);
			}
		}
		catch(Exception exp){
			showBean=new showPage();
			session.setAttribute("showpage", showBean);
		}
		showBean.setPageSize(10);
		int showPage=Integer.parseInt(request.getParameter("showPageNum"));
		if(showPage>showBean.getPageAllCount()){
			showPage=1;
		}
		if(showPage<=0){
			showPage=showBean.getPageAllCount();
		}
		showBean.setShowPageNum(showPage);
		int pageSize=showBean.getPageSize();
		String url="jdbc:mysql://localhost:3306/Register";
		try{
			con=DriverManager.getConnection(url,"root","asdfgH11");
			Statement sql=con.createStatement();
			String condition="SELECT * FROM register";
			ResultSet rs=sql.executeQuery(condition);
			rowSet=new CachedRowSetImpl();
			rowSet.populate(rs);
			con.close();
			showBean.setRowSet(rowSet);
			rowSet.last();
			int m=rowSet.getRow();
			int n=pageSize;
			int pageAllCount=((m%n)==0)?(m/n):(m/n+1);
			showBean.setPageAllCount(pageAllCount);
			presentPageResult=show(showPage,pageSize,rowSet);
			showBean.setPresentPageResult(presentPageResult);
		}
		catch(SQLException exp){
			
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("/showAllRegisters.jsp");
		dispatcher.forward(request, response);
	}
	public StringBuffer show(int page,int pageSize,CachedRowSetImpl rowSet){
		StringBuffer str=new StringBuffer();
		try{
			rowSet.absolute((page-1)*pageSize+1);
			for(int i=0;i<pageSize;i++){
				str.append("<tr>");
				str.append("<td>"+rowSet.getString(1)+"</td>");
				str.append("<td>"+rowSet.getString(2)+"</td>");
				str.append("<td>"+rowSet.getString(3)+"</td>");
				str.append("<td>"+rowSet.getString(4)+"</td>");
				str.append("<td>"+rowSet.getString(5)+"</td>");
				str.append("<td>"+rowSet.getString(6)+"</td>");
				str.append("<td>"+rowSet.getString(7)+"</td>");
				str.append("<td>"+rowSet.getString(8)+"</td>");
				str.append("<td>"+rowSet.getString(9)+"</td>");
				str.append("</tr>");
				rowSet.next();
			}
		}
		catch(SQLException exp){
			
		}
		return str;
	}

}
