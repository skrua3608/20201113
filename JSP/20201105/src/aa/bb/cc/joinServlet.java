package aa.bb.cc;

import java.io.IOException;

//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aa.bb.cc.db.DBManager;
import aa.bb.cc.bean.Member;



@WebServlet("/Join")
public class joinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public joinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8"); // 요청 파라메터(name, gender, id)
        response.setContentType("text/html; charset=utf-8");
        
//        PrintWriter out = response.getWriter();
//        out.println("한글 잘되나");
        
        String pname = request.getParameter("name");
        String pgender = request.getParameter("gender");
        String pid = request.getParameter("id");
        String ppwd = request.getParameter("pwd");
        String pcpwd = request.getParameter("cpwd");
        String paddr = request.getParameter("addr");
        String pphone = request.getParameter("phone");
        String pemail = request.getParameter("email");
        String[] phobby = request.getParameterValues("hobby");
        String phos = "";
        for(String temp : phobby) {
           phos += temp;
        }
        
        // 데이터 저장
        DBManager dm = new DBManager();
        dm.insert(new Member(pname, pgender, pid, ppwd, pcpwd, paddr, pphone, pemail, phos));
        
        RequestDispatcher rd = request.getRequestDispatcher("join.jsp");
        rd.forward(request, response);
     }
     
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
     }
  }