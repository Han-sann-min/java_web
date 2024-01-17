package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class checkproduct
 */
@WebServlet("/checkproduct")
public class checkproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkproduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
        process(request, response);

	}
	
	protected void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//    	<input type="text" id="username" name="id" required>
//        <label for="password">비밀번호:</label>
//        <input type="password" id="password" name="pw" required>
    	String category = req.getParameter("category");
    	String quantity = req.getParameter("quantity");
    	
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter(); // 응답에 적을 PrintWriter 객체 생성

    	out.println("<html lang=\"en\">\r\n"
    			+ "<head>\r\n"
    			+ "    <meta charset=\"UTF-8\">\r\n"
    			+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
    			+ "    <title>주문 정보</title>\r\n"
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
    			+ "        .order-info {\r\n"
    			+ "            background-color: #fff;\r\n"
    			+ "            padding: 20px;\r\n"
    			+ "            border-radius: 8px;\r\n"
    			+ "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n"
    			+ "            width: 300px;\r\n"
    			+ "            margin-top: 20px;\r\n"
    			+ "        }\r\n"
    			+ "\r\n"
    			+ "        p {\r\n"
    			+ "            margin: 8px 0;\r\n"
    			+ "        }\r\n"
    			+ "    </style>\r\n"
    			+ "</head>\r\n"
    			+ "<body>\r\n"
    			+ "    <h1>주문 정보</h1>\r\n"
    			+ "\r\n"
    			+ "    <div class=\"order-info\">\r\n"
    			+ "        <p>구매한 물품:" + category + "</p>\r\n"
    			+ "        <p>수량: " + quantity + "</p>\r\n"
    			+ "    </div>\r\n"
    			+ "\r\n"
    			+ "    <script>\r\n"
    			+ "        // JavaScript를 사용하여 주문 정보 동적으로 삽입\r\n"
    			+ "        var category = \"상품 카테고리\"; // 실제 상품 카테고리를 대입하세요.\r\n"
    			+ "        var quantity = 3; // 실제 수량을 대입하세요.\r\n"
    			+ "\r\n"
    			+ "        document.getElementById(\"category\").innerText = category;\r\n"
    			+ "        document.getElementById(\"quantity\").innerText = quantity;\r\n"
    			+ "    </script>\r\n"
    			+ "</body>\r\n"
    			+ "</html>");
    	
    }

}
