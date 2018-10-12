package serv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

		if (uri.equals("/Project2/getNGTests.do")) {
			System.out.println("HEY");
			TestNG runner = new TestNG();
			List<String> suiteFiles = new ArrayList<String>();

			String suitePath = PropertyParser.getProp("ec2xml");

			suiteFiles.add(suitePath);
			runner.setTestSuites(suiteFiles);
			runner.run();

			JsonArray testResults = ResultParser.parseJson();

			response.setContentType("application/json");
			response.getWriter().print(testResults);
		}

		if (uri.equals("/Project2/getCukeTests.do")) {
			TestNG runner = new TestNG();
			List<String> suiteFiles = new ArrayList<String>();

			String suitePath = PropertyParser.getProp("ec2cucxml");

			suiteFiles.add(suitePath);
			runner.setTestSuites(suiteFiles);
			runner.run();

			JsonArray testResults = ResultParser.parseCukeJson();

			response.setContentType("application/json");
			response.getWriter().print(testResults);
		}
		
		if (uri.equals("/Project2/getProtractorTests.do")) {
			
			String cmd = "cmd /c chdir C:\\Users\\Administrator\\Desktop\\CaliburWebApp\\CaliberTest\\tests & "
	                + "C:\\Users\\Administrator\\AppData\\Roaming\\npm\\protractor conf.js";
	        Runtime run = Runtime.getRuntime();
	        Process myProcess = run.exec(cmd);
	        
	        try {
	            myProcess.waitFor();
	            System.out.println("After for");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        BufferedReader buf = new BufferedReader(new InputStreamReader(myProcess.getInputStream())); // gets protractor output
	        String str = "", data = "";
	        while ((str = buf.readLine()) != null) {
	            data += str + "\n"; // puts in a formatted string
	        }
	        System.out.println(data);
	        response.getWriter().append(data);
	        
	        buf.close();
	        myProcess.destroy();
			
		}

	}
}
