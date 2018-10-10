package serv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.testng.TestNG;

import com.google.gson.JsonArray;

import util.PropertyParser;
import util.ResultParser;

public class RequestHelper {

	public static void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();

		if (uri.equals("/Project2/getTests.do")) {
			TestNG runner = new TestNG();
			List<String> suiteFiles = new ArrayList<String>();
			
			String suitePath = PropertyParser.getProp("dylanxml");
			
			suiteFiles.add(suitePath);
			runner.setTestSuites(suiteFiles);
			runner.run();
			
			String testResults = ResultParser.parseJson().toString();
			
			response.setContentType("application/json");
			response.getWriter().print(testResults);
//			response.getWriter().append(testResults);
		}

	}
}
