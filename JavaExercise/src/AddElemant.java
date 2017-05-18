import java.util.Iterator;
import java.util.List;

public class AddElemant {

	public void addElemant(List<Integer>ls,int number) {
	   int size=0;       
	   size=ls.size();
	   ls.add(size/2, number);
	   Iterator<Integer> iterator=ls.iterator();
	   while(iterator.hasNext()) {
			System.out.println(iterator.next());
	}
	
	
}
	
	
}

