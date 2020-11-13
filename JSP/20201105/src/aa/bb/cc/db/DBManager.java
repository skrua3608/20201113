package aa.bb.cc.db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import aa.bb.cc.bean.Member;

//제어문...함수호출....객체 사용...
public class DBManager {

	 public void insert(Member member) {
	      Connection conn = null;
	      PreparedStatement pstmt = null;

	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");

	         conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
	         pstmt = conn.prepareStatement("INSERT INTO memberChap04" + 
	               "(IDX, NAME, GENDER, ID, PWD, CPWD, ADDR, PHONE, EMAIL, HOBBY, REG_DATE) " +
	               "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)");
	         
	         pstmt.setString(1, "1");
	         pstmt.setString(2, member.getPname());
	         pstmt.setString(3, member.getPgender());
	         pstmt.setString(4, member.getPid());
	         pstmt.setString(5, member.getPpwd());
	         pstmt.setString(6, member.getPcpwd());
	         pstmt.setString(7, member.getPaddr());
	         pstmt.setString(8, member.getPphone());
	         pstmt.setString(9, member.getPemail());
	         pstmt.setString(10, member.getPhobby());
	         
	         pstmt.executeUpdate();
	         System.out.println("완료");
	      } catch (Exception e) {
	         System.out.println("완료");
	         e.printStackTrace();
	      } finally {
	         try {
	            if (pstmt != null) {
	               pstmt.close();
	            }
	            if (conn != null) {
	               conn.close();
	            }
	         } catch (Exception e) {
	         }
	      }
	   }

	public ArrayList<Member> select() {
	
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs= null;// select 해서 반환되는 table 내용담는 객체
		
		ArrayList<Member> al =new ArrayList<Member>(); //rs 내용을 바꿔서 arraylist 에 담는 객체
		
		try {
			  Class.forName("oracle.jdbc.driver.OracleDriver"); //ojdbc6.jar 추가되어 있는지
			  //db 연결하는것 
		      conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
		      pstmt = conn.prepareStatement("select * from memberchap04 order by reg_date desc");
		      //select -> executeQuery()
		      //insert update delete -> executeUpdate()
		      rs = pstmt.executeQuery();
		      int i=1;
		      while(rs.next()) {//그다음 행이 있으면 true 없으면 false
		    	 // System.out.println(i++);
		    	  Member temp = new Member();
		    	  temp.setPaddr(rs.getString("addr"));
		    	  temp.setPcpwd(rs.getString("cpwd"));
		    	  temp.setPemail(rs.getString("email"));
		    	  temp.setPgender(rs.getString("gender"));
		    	  temp.setPhobby(rs.getString("hobby"));
		    	  temp.setPid(rs.getString("id"));
		    	  temp.setPname(rs.getString("name"));
		    	  temp.setPphone(rs.getString("phone"));
		    	  temp.setPpwd(rs.getString("pwd"));
		    	  System.out.println(temp);
		    	  
		    	  al.add(temp);
		    	  
		      }
		      
		      
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null) conn.close();
				
			}catch (Exception e) {
		}
		
		}
		return al;
	}
	}
