public class Dalek1 {

	private double batteryCharge;

	public Dalek1() {
		this.batteryCharge = 5;
	}
	
	public void batteryReCharge(double c) {
		this.batteryCharge += c;
		System.out.printf("Battery charge is: %s", this.batteryCharge);
		System.out.println();
	}
	
	public void move(int distance) {
		int count = 1;
		int remainingDistance = distance; // zashtoto po-kusno shte namalyazvame
											// razstoyanieto(i za da moje da
											// sravnim );
		while (this.batteryCharge >= 0.5 && remainingDistance > 0) {
			System.out.print("[" + count + "] ");
			count++;
			this.batteryCharge -= 0.5;
			remainingDistance -= 1;
			if (this.batteryCharge == 0) {
				System.out.print("Out of power!");
			}
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Dalek1 d = new Dalek1(); // start off with a well-charged battery
		d.move(11); // move around and use up the charge
		d.batteryReCharge(2.5); // get a new charge
		d.batteryReCharge(0.5); // add a bit more
		d.move(5); // move some more
	}
}
