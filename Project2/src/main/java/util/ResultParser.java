package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class ResultParser {

	private static ResultParser resultParser;
	
	public static ResultParser getResultParser() {
		if (resultParser == null) {
			resultParser = new ResultParser();
		}
		return resultParser;
	}
	
	public static JsonArray parseJson() throws IOException {
//		StringBuilder jsonString = new StringBuilder();
//		
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("../Project2/src/main/resources/dylanTest.json"));
//			
//			while(true) {
//				String sCurrentLine = br.readLine();
//				if (sCurrentLine == null) {
//					br.close();
//					break;
//				}
//				jsonString.append(sCurrentLine);
//			}
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		return jsonString.toString();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\David\\Desktop\\GitHubProjectpull\\Project2\\Project2\\src\\main\\resources\\dylanTest.json"));
		JsonParser parser = new JsonParser();
		JsonArray array = parser.parse(br).getAsJsonArray();
		return array;
	}
	

	
}
