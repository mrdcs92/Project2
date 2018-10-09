package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonReporter implements IReporter {

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        JsonArray results = new JsonArray();
        for (ISuite suite : suites) {
        	results.add(createSuiteJsonObject(suite));
        }
        
        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter("../Project2/src/main/resources/dylanTest.json"));
        	Gson gson = new GsonBuilder().create();
        	String jsonString = gson.toJson(results);
        	writer.write(jsonString);
        	writer.close();
        } catch (IOException e) {
        	e.printStackTrace();
        }
	}
	
	public JsonObject createSuiteJsonObject(ISuite suite) {
		JsonObject result = new JsonObject();
		JsonArray passedMethods = new JsonArray();
		JsonArray failedMethods = new JsonArray();
		JsonArray skippedMethods = new JsonArray();
		
		for (Entry<String, ISuiteResult> element: suite.getResults().entrySet()) {
			ITestContext context = element.getValue().getTestContext();
			passedMethods.addAll(createResultJsonArray(context.getPassedTests().getAllResults()));
			failedMethods.addAll(createResultJsonArray(context.getFailedTests().getAllResults()));
			skippedMethods.addAll(createResultJsonArray(context.getSkippedTests().getAllResults()));
		}
		
		result.addProperty("name", suite.getName());
		result.add("passed", passedMethods);
		result.add("failed", failedMethods);
		result.add("skipped", skippedMethods);
		
//		suite.getResults().entrySet().forEach(element -> {
//			ITestContext context = element.getValue().getTestContext();
//			passedMethods.addAll(createResultJsonArray(context.getPassedTests().getAllResults()));
//			failedMethods.addAll(createResultJsonArray(context.getFailedTests().getAllResults()));
//			skippedMethods.addAll(createResultJsonArray(context.getSkippedTests().getAllResults()));
//		});
//		result.addProperty("name", suite.getName());
//		result.add("passed", passedMethods);
//		result.add("failed", failedMethods);
//		result.add("skipped", skippedMethods);
		
		return result;
	}
	
    public JsonArray createResultJsonArray(Set<ITestResult> results) {
    	JsonArray result = new JsonArray();
    	
    	for (ITestResult itestResult : results) {
    		JsonObject currentJsonResult = new JsonObject();
    		currentJsonResult.addProperty("name", itestResult.getName());
    		result.add(currentJsonResult);
    	}
    	return result;
    }

}