import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Problem3 {
	public void listToSet() {

		List<String> list = CountryFactory.ContrtyList();
		Set<String> set = new HashSet<String>(list);
		System.out.println("Value inside my list");
		System.out.println(list);
		System.out.println("Value inside my set");
		System.out.println(set);
	}
}
