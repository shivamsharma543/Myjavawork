import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Problem2 {
	public void SortedAndShuffleList() {
		List<String> ls = CountryFactory.ContrtyList();
		Collections.sort(ls);
		Iterator<String> iterator = ls.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			if (count == 0)
				System.out.println("This is my sorted list");
			System.out.print(iterator.next() + " , ");
			count++;

		}
		count = 0;
		Collections.shuffle(ls);
		Iterator<String> iterator1 = ls.iterator();
		while (iterator1.hasNext()) {
			if (count == 0) {
				System.out.println(" ");
				System.out.println("This is my shuffle list");
			}
			System.out.print(iterator1.next() + " , ");
			count++;

		}

	}

}
