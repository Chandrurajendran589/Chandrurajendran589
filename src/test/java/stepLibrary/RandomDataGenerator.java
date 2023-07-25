package stepLibrary;

import java.util.Random;

public class RandomDataGenerator {
	private final static String lowers = "abcdefghijklmnopqrstuvwxyz";

	private final static String uppers = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private final static String numbers = "0123456789";

	private final static String symbols = "!@#$%^&*()-_=+`~/?.>,<;:'|\"";

	private final static Random random = new Random();


	public static String generateEmail() {
		return generateRandomString(3, 5, false, true, true, false) +
				"@" +
				generateRandomString(3, 5, false, true, false, false) +
				"." +
				generateRandomString(2, 3, false, true, false, false);
	}

	public static String generatePassword() {
		return generateRandomString(8, true, true, true, true);
	}

	public static String generateName() {
		return uppers.charAt(random.nextInt(uppers.length())) +
				generateRandomString(1, 9, false, true, false, false);
	}

	public static String generateRandomString(int minLength, int maxLength, boolean includeUpper, boolean includeLower, boolean includeNumbers, boolean includeSymbols) {
		return generateRandomString(minLength + random.nextInt(maxLength - minLength + 1), includeUpper, includeLower, includeNumbers, includeSymbols);
	}

	public static String generateRandomString(int length, boolean includeUpper, boolean includeLower, boolean includeNumbers, boolean includeSymbols) {
		String set = "";

		if (includeUpper) {
			set += uppers;
		}
		if (includeLower) {
			set += lowers;
		}
		if (includeNumbers) {
			set += numbers;
		}
		if (includeSymbols) {
			set += symbols;
		}

		if (set.length() == 0) {
			throw new IllegalArgumentException("Must include at least one character set");
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < length; i++) {
			result.append(set.charAt(random.nextInt(set.length())));
		}

		return result.toString();
	}

}
