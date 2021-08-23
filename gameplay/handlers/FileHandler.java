package gameplay.handlers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FileHandler {
	public static void doFunctionOnFile(String file, UnaryOperator<String> function) {
		try {

			// Wtf is this, Java? 4 variables to read a file???
			ClassLoader loader = TextHandler.class.getClassLoader();
			InputStream stream = loader.getResourceAsStream(file);
			InputStreamReader isReader = new InputStreamReader(stream);
			BufferedReader reader = new BufferedReader(isReader);

			// Loop through lines
			String line;
			while ((line = reader.readLine()) != null) {
				// Apply the lambda function to each line
				TextHandler.println(function.apply(line));
			}

			// No memory leaks 4 u
			reader.close();
			isReader.close();
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
