import java.util.ArrayList;
import java.util.List;

public class CountryFactory {
	static List<String> list = new ArrayList<String>();

	public static List<String> ContrtyList() {
		synchronized (CountryFactory.class) {
			list.add("India");
			list.add("Pakistan");
			list.add("Bangladesh");
			list.add("Nepal");
			list.add("Sri Lanka");
			list.add("China");
			list.add("Bhutan");
			list.add("Bangladesh");
			list.add("Nepal");
			list.add("Sri Lanka");
			list.add("China");
			list.add("Bhutan");

		}
		return list;
	}

}
