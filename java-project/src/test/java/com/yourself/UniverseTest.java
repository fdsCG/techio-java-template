package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class UniverseTest {

	public static final String YODA =
			"* ● ¸ .　¸. :° ☾ ° 　¸. ● ¸ .　　¸.　:. • ○ ° ★　 . • ○ ° ★　 .　 *　.　.　　¸ .☾ ☆ ¸. ¸\n" + 
			"       　★ ° ☾ ☆ ¸. ¸ 　★　 :.　 . • ○　¸.  .　　　　　　　　　* ¸ 　★　 :.  ★　 .　 *　.\n" + 
			"__.-._      ° . .　　　　.　☾ °☆ 　. *   ¸ .　　　　° :.　 . • ○ ° 　 　　.　　　　　.\n" + 
			"'-._\\7'      .　　° ☾  °☆ 　¸.  ● .　　★　　 ° ☾ ☆ ¸. ¸ 　　 :.　 . • ○ ° ★　.　 *　.　.\n" + 
			" /'.-c     　   * ●  ¸.　　° ☾    ° 　¸.     ¸ .　　¸.　° :.　 . • ° 　 .　 *　:.　.　¸ . \n" + 
			" |  /T\n" + 
			"_)_/LI";

	@Test
	public void test() throws FileNotFoundException {
		try {
			Assert.assertEquals("Running Universe.countAllStars(2, 3)...", 5, Universe.countAllStars(2, 3));
			Assert.assertEquals("Running Universe.countAllStars(9, -3)...", 6, Universe.countAllStars(9, -3));
			success(true);

			if (existsInFile("Arrays.stream(galaxies).sum()", new File("./src/main/java/com/yourself/Universe.java"))) {
				msg("My personal Yoda, you are. 🙏", YODA);
			} else {
				msg("Kudos 🌟", "Did you know since Java8 is out you can use streams? Try it!");
				msg("Kudos 🌟", "");
				msg("Kudos 🌟", "int[] galaxies = {37, 3, 2};");
				msg("Kudos 🌟", "int totalStars = Arrays.stream(galaxies).sum(); // 42");
			}
		} catch (AssertionError ae) {
			success(false);
			msg("Oops! 🐞", ae.getMessage());
			msg("Hint 💡", "Did you try to accumulate all stars into 'totalStars'? 🤔");
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

	// check if a string exists in a text file
	private static boolean existsInFile(String str, File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		try {
			while (scanner.hasNextLine()) {
				if (scanner.nextLine().contains(str))
					return true;
			}
			return false;
		} finally {
			scanner.close();
		}
	}
}