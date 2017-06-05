package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class FarmTest {
	
	private static final String YODA =
			"  __.-._\n" + 
			"  '-._\"7'\n" + 
			"   /'.-c\n" + 
			"   |  /T\n" + 
			"  _)_/LI";

	@Test
	public void test() throws IOException {
		try {
			Assert.assertEquals("Running Farm.howManyChicks(2, 3)...", 5, Farm.howManyChicks(2, 3));
			Assert.assertEquals("Running Farm.howManyChicks(9, -3)...", 6, Farm.howManyChicks(9, -3));
			success(true);
			
			if (!existsInFile("Arrays.stream(ns).sum()", new File("./src/main/java/com/yourself/Sum.java"))) {
				msg("Kudos! 🐣", "Did you know since Java8 is out you can use streams? Try it!");
				msg("Kudos! 🐣", "");
				msg("Kudos! 🐣", "int[] ns = {1, 2, 3};");
				msg("Kudos! 🐣", "int sum = Arrays.stream(ns).sum(); //prints 6");
			} else {
				msg("You’re my personal Yoda 🙏", YODA);
			}
		} catch (AssertionError ae) {
			success(false);
			msg("Oops! 🐔", ae.getMessage());
			msg("Hint 💡", "Did you try to accumulate all values into the variable 'result'?");
		}
	}

	private static void msg(String channel, String msg) {
		msg = msg.replaceAll("\"", "\\\\\"");
		for (String s : msg.split("\\n")) {
			System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, s));
		}
	}

	private static void success(boolean success) {
		System.out.println(String.format("TECHIO> success %s", success));
	}

	// check if a particular text belongs to a file
	private static boolean existsInFile(String text, File srcFile) throws FileNotFoundException {
		Scanner scanner = new Scanner(srcFile);
		try {
			while (scanner.hasNextLine()) {
				String lineFromFile = scanner.nextLine();
				if (lineFromFile.contains(text))
					return true;

			}
			return false;
		} finally {
			scanner.close();
		}
	}
}