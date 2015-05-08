import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Map;

public class ActivityHoliday extends Holiday {

	private HashMap<String, Cost> activities;

	public ActivityHoliday(String destination, int days) {
		super(destination, days);
		this.activities = new HashMap<String, Cost>(10);

	}

	public void addActivity(String name, Cost cost) {
		this.activities.put(name, cost);
	}

	@Override
	public String toString() {
		String result = super.toString() + "\n";

		result += "Activities:\n";

		for (Map.Entry<String, Cost> activity : this.activities.entrySet()) {
			result += activity.getKey() + " " + activity.getValue().toString()
					+ "\n";
		}
		return result.trim();

	}

}
