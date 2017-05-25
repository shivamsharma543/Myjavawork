import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MainCalling {

	public static void main(String[] args) {
		// ListToArray ls=new ListToArray();
		// ls.convertToList();
		AddElemant add = new AddElemant();
//		List<Integer> list = new LinkedList<Integer>();
//		add.addElemant(list, 5);
//		add.addElemant(list, 10);
//		add.addElemant(list, 15);
//		add.addElemant(list, 20);
//		add.addElemant(list, 25);
//		Iterator<Integer> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			// MyAbstractChild myabstractchild = new MyAbstractChild();
//			// myabstractchild.print1();
//		}
		FileCount filecount = new FileCount();
		Map<String, List<Integer>> map =filecount.findString();
		//Iterator<String> mapiterator=map.keySet().iterator();
		
		for(String m: map.keySet()){
			 //System.out.println(map.get(m));
			 System.out.println(m);
		}
	}

}
