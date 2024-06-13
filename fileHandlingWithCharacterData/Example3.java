package com.fileHandlingWithCharacterData;

import java.io.FileWriter;
import java.io.IOException;

public class Example3 {

	public static void main(String[] args) throws IOException {

		FileWriter out = null;

		String text1 = "Welcome to Java File Handling Concept.";
		String text2 = "Welcome to Java Programming";

		char values[] = text2.toCharArray();

		try {

			out = new FileWriter("D:\\Java\\file.txt", true);

			if (out != null) {
				out.write(values);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.close();
		}

	}

}
