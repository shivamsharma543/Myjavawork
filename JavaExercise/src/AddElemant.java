
import java.util.List;

public class AddElemant {

	public List<Integer> addElemant(List<Integer> ls, int number) {
		int size;
		int addingposition;
		size = ls.size();
		// System.out.println(size);

		if (size % 2 != 0)
			addingposition = size / 2 + 1;
		else
			addingposition = size / 2;

		ls.add(addingposition, number);
		return ls;

	}

}
