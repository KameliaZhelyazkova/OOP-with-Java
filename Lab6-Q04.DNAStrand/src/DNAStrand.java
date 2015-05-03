import org.omg.CORBA.PUBLIC_MEMBER;

public class DNAStrand {

	private String dna;

	public DNAStrand(String dna) {
		this.dna = dna;
	}

	public boolean isValidDNA() {
		if (dna == null || dna == "") {
			return false;
		}
		String strignWithoutTAGC = this.dna.replace("T", "").replace("A", "")
				.replace("G", "").replace("C", "");
		return strignWithoutTAGC.length() == 0; 
	}

	public String complementWC() {
		String swapedAT = this.dna.replace('T', 't').replace('A', 'T')
				.replace('t', 'A');
		String swapedATCG = swapedAT.replace('G', 'g').replace('C', 'G')
				.replace('g', 'C');

		return swapedATCG;
	}

	public String palindromeWC() {
		String complement = complementWC();
		char[] myCharArray = new char[complement.length()];
		for (int i = 0; i < myCharArray.length; i++) {
			myCharArray[i] = complement.charAt(complement.length() - 1 - i);
		}
		// String convertedCharArrayToAString = new String(myCharArray);
		// return convertedCharArrayToAString;
		return new String(myCharArray);
	}

	public boolean containsSequence(String seq) {

		if (this.dna.contains(seq)) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return dna;
	}
	// public static void summarise(DNAStrand dna) {
	// System.out.println("Original DNA Sequence: " + dna);
	// if (dna.isValidDNA()) {
	// System.out.println("Is valid");
	// System.out.println("Complement: " + dna.complementWC());
	// System.out.println("WC Palindrome: " + dna.palindromeWC());
	// }
	// else {
	// System.out.println("Not Valid DNA");
	// }
	// }

}
