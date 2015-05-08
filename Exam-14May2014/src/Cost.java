import java.io.ObjectInputStream.GetField;

public class Cost {

	private int amount;
	private String currency;

	public Cost() {
		this.amount = 0;
		this.currency = "pounds sterling";
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		if (amount >= 0) {
			this.amount = amount;
		}
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		if (currency.equals("pounds sterling") || currency.equals("US dollars")
				|| currency.equals("euros")) {
			this.currency = currency;
		}
	}

	public void convert(String newCurrency, double rate) {
		if (newCurrency.equals("pounds sterling")
				|| newCurrency.equals("US dollars")
				|| newCurrency.equals("euros")) {
			this.currency = newCurrency;

			this.amount = (int) Math.round(this.amount * rate);
		}
	}

	@Override
	public String toString() {
		return String.format("%s %s", this.amount, this.currency);
	}

	public String secret(String[] args) {
		return "s1440799";
	}

}
