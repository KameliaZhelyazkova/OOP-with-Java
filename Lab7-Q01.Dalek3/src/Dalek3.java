import java.util.ArrayList;

public class Dalek3 {
	private ArrayList<String> sayings = new ArrayList<String>();

	public void setSayings(String[] sayings) {
		for (int i = 0; i < sayings.length; i++) {
			this.sayings.add(sayings[i]);
		}
	}

	public void speak() {// cares about printing out
		if (this.sayings.size() == 0) {
			System.out.println("No utterances installed!");
		} else {
			int N = sayings.size();
			int randomIndex = (int) (Math.random() * N);
			System.out.println(this.sayings.get(randomIndex));
		}
	}

	public void addSaying(String s) {
		this.sayings.add(s);
	}

	public static void main(String[] args) {

		Dalek3 d1 = new Dalek3();
		String[] u1 = { "Exterminate, Exterminate!", "I obey!",
				"Exterminate, annihilate, DESTROY!", "You cannot escape.",
				"Daleks do not feel fear.", "The Daleks must survive!" };
		d1.setSayings(u1);

		System.out.println("\nDalek d1 says: ");
		for (int i = 0; i < 10; i++) {
			d1.speak();
		}

		System.out.println("\nDalek d2 says: ");
		Dalek3 d2 = new Dalek3();
		String[] u2 = { "I obey!" };
		d2.setSayings(u2);

		for (int i = 0; i < 10; i++) {
			d2.speak();
		}

	}
}