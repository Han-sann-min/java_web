package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 어노테이션으로 컨트롤러의 url 경로를 매핑할수 있다.
@WebServlet("/validation")
//@WebServlet(name="helloServlet_", urlPatterns="/hello")
public class LoginCheck extends HttpServlet {
	
        // init 생성자 자동 호출 
        public LoginCheck() {
                System.out.println("생성자 - 처음 호출할 때만 실행되고 그 다음에는 실행될 일이 없습니다.");
        }
        
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//                super.doGet(req, res);
                // req -> 사용자가 요청한 내용
                // res -> 서버가 요청에 대해 보내줄 내용
                
                //Stream을 이용 -> byte 단위로 값을 쪼개서 보냄 -> UTF-8은 2바이트
            process(req, res);

        }
        
        protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        response.getWriter().append("Post 방식으로 호출 ");
            process(req, res);
        }
        
        protected void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        	<input type="text" id="username" name="id" required>
//            <label for="password">비밀번호:</label>
//            <input type="password" id="password" name="pw" required>
        	String id = req.getParameter("id");
        	String pw = req.getParameter("pw");
        	
            res.setContentType("text/html;charset=utf-8");
            PrintWriter out = res.getWriter(); // 응답에 적을 PrintWriter 객체 생성

        	if (id.toLowerCase().equals("master") && (pw.equals("1111"))) {
        		out.println("<html>\r\n"
        				+ "<head>\r\n"
        				+ "    <meta charset=\"UTF-8\">\r\n"
        				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
        				+ "    <title>Welcome Page</title>\r\n"
        				+ "    <style>\r\n"
        				+ "        body {\r\n"
        				+ "            font-family: Arial, sans-serif;\r\n"
        				+ "            background-color: #f4f4f4;\r\n"
        				+ "            text-align: center;\r\n"
        				+ "            margin: 0;\r\n"
        				+ "            padding: 0;\r\n"
        				+ "            display: flex;\r\n"
        				+ "            flex-direction: column;\r\n"
        				+ "            align-items: center;\r\n"
        				+ "            justify-content: center;\r\n"
        				+ "            height: 100vh;\r\n"
        				+ "        }\r\n"
        				+ "\r\n"
        				+ "        h1 {\r\n"
        				+ "            color: #333;\r\n"
        				+ "        }\r\n"
        				+ "\r\n"
        				+ "        .welcome-message {\r\n"
        				+ "            margin-bottom: 20px;\r\n"
        				+ "        }\r\n"
        				+ "\r\n"
        				+ "        .product-link {\r\n"
        				+ "            text-decoration: none;\r\n"
        				+ "            background-color: #4caf50;\r\n"
        				+ "            color: #fff;\r\n"
        				+ "            padding: 10px 20px;\r\n"
        				+ "            border-radius: 4px;\r\n"
        				+ "            font-size: 16px;\r\n"
        				+ "            transition: background-color 0.3s ease;\r\n"
        				+ "        }\r\n"
        				+ "\r\n"
        				+ "        .product-link:hover {\r\n"
        				+ "            background-color: #45a049;\r\n"
        				+ "        }\r\n"
        				+ "    </style>\r\n"
        				+ "</head>\r\n"
        				+ "<body>\r\n"
        				+ "    <h1>Welcome Page</h1>\r\n"
        				+ "\r\n"
        				+ "    <div class=\"welcome-message\">\r\n"
        				+ "        <p>로그인 되었습니다!</p>\r\n"
        				+ "        <p>반갑습니다, <span id=\"id\"></span>님</p>\r\n"
        				+ "    </div>\r\n"
        				+ "\r\n"
        				+ "    <a href=\"product.html\" class=\"product-link\">상품 구매로 가기</a>\r\n"
        				+ "\r\n"
        				+ "    <script>\r\n"
        				+ "        // JavaScript를 사용하여 id 값을 동적으로 삽입\r\n"
        				+ "        var userId = \"사용자ID\"; // 여기에 실제 사용자 ID 값을 대입하세요.\r\n"
        				+ "        document.getElementById(\"userId\").innerText = userId;\r\n"
        				+ "    </script>\r\n"
        				+ "</body>\r\n"
        				+ "</html>");
        		

        	} 
        	else if (id.toLowerCase().equals("master") )
        	{
        		out.println("비밀번호를 다시 입력해주세요");
        	}
        	else {
        		out.println("없는 회원입니다.");
        	}
        	
        }
}
