import java.util.Calendar;

public class CreditCard {

	private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;

	public CreditCard(int expiryMonth, int expiryYear, String fisrstName,
			String lastName, String ccNumber) {
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = fisrstName;
		this.lastName = lastName;
		this.ccNumber = ccNumber;

	}

	public String formatExpiryDate() {
//		String padedMonth = String.format("%02d", this.expiryMonth);		
		String shortYear = Integer.toString(this.expiryYear).substring(2, 4);
		return this.expiryMonth + "/" + shortYear;
//		return padedMonth + "/" + shortYear;
	}

	public String formatFullName() {
		return this.firstName + " " + this.lastName;
	}

	public String formatCCNumber() {
		String firstFourDigits = ccNumber.substring(0, 4);
		String secondFourDigitPack = ccNumber.substring(4, 8);
		String thirdFourDigitPack = ccNumber.substring(8, 12);
		String fourthFourDigitPack = ccNumber.substring(12);
		return firstFourDigits + " " + secondFourDigitPack + " "
				+ thirdFourDigitPack + " " + fourthFourDigitPack;
	}

	public boolean isValid() {
		Calendar now = Calendar.getInstance();
		int currentYear = now.get(Calendar.YEAR);
		int currentMonth = now.get(Calendar.MONTH) + 1;

		if (expiryYear > currentYear) {
			return true;
		}
		if (expiryYear == currentYear && expiryMonth > currentMonth) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return ("Number: " + formatCCNumber() + "\nExpiration date: "
				+ formatExpiryDate() + "\nAccount holder: " + formatFullName()
				+ "\nIs valid: " + isValid());
	}

	public static void main(String[] args) {
		CreditCard cc = new CreditCard(1, 2016, "Bob", "Jones",
				"1234567890123456");
		System.out.println(cc.toString());
	}
}
