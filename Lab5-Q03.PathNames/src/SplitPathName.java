public class SplitPathName {

	public static String[] splitPath(String s) {
		String[] components = new String[4];

		/*
		 * Returns 4 components: [0] - directory [1] - filename [2] -
		 * filename-base [3] - filename-extension
		 */
		int indexLastSlash = s.lastIndexOf("/");
		if (indexLastSlash == -1) { // in case "/" does not occure
			components[0] = "";
			components[1] = s;
		} else {
			components[0] = s.substring(0, indexLastSlash + 1); // Why here
																// there is a '+
																// 1'?
			components[1] = s.substring(indexLastSlash + 1, s.length());

		}
		int indexOfFirstDot = components[1].lastIndexOf(".");
		if (indexOfFirstDot == -1) {
			components[2] = s.substring(indexLastSlash + 1, s.length()); // or
																			// components[1]
			components[3] = "";
		} else {
			components[2] = components[1].substring(0, indexOfFirstDot);
			components[3] = components[1].substring(indexOfFirstDot,
					components[1].length());
		}

		return components;
	}

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			String[] components = splitPath(args[i]);

			// System.out.println("File: " + components[1] + " Type: "
			// + components[3] + " [" + components[0] + "]");

			System.out.printf("File: %s Type: %s [%s]\n", components[1],
					components[3], components[0]);
		}
	}
}
