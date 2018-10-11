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
		String jsonPath = PropertyParser.getProp("ec2json");
		BufferedReader br = new BufferedReader(new FileReader(jsonPath));
		JsonParser parser = new JsonParser();
		JsonArray array = parser.parse(br).getAsJsonArray();
		return array;
	}

	public static JsonArray parseCukeJson() throws IOException {
		String jsonPath = PropertyParser.getProp("ec2cukejson");
		BufferedReader br = new BufferedReader(new FileReader(jsonPath));
		JsonParser parser = new JsonParser();
		JsonArray array = parser.parse(br).getAsJsonArray();
		return array;
	}

}
