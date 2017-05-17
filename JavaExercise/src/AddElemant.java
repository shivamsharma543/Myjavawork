import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddElemant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddElemant add= new AddElemant();
		List<Integer>ls =new LinkedList<Integer>();
		add.addElemant(ls,5);
		add.addElemant(ls,10);
		add.addElemant(ls,15);
		add.addElemant(ls,20);
		add.addElemant(ls,25);
		Iterator<Integer> iterator=ls.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
   public List<Integer> addElemant(List<Integer>ls,int number) {
	   int size=0;       
	   size=ls.size();
	   ls.add(size/2, number);
	return ls;
	
}
	
	
}

