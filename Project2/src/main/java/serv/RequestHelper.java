package serv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.testng.TestNG;

import com.google.gson.JsonArray;

import util.ResultParser;

public class RequestHelper {

	public static void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();

		if (uri.equals("/Project2/getTests.do")) {
			System.out.println("hello");
			
			TestNG runner = new TestNG();
			List<String> suiteFiles = new ArrayList<String>();
			
			suiteFiles.add("D:/MyRepo/Project2/Project2/src/test/resources/testng.xml");
			runner.setTestSuites(suiteFiles);
			runner.run();
			
			JsonArray testResults = ResultParser.parseJson();
			
			response.setContentType("application/json");
			response.getWriter().print(testResults);
		}

	}
}
