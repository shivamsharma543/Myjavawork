import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Problem4 {
	List<String>arrayList=new ArrayList<String>();
	List<String>linkList=new LinkedList<String>();
	List<String>newLinkList=new LinkedList<String>(arrayList);
	public void PrintList(){
		arrayList=CountryFactory.ContrtyList();
		linkList=CountryFactory.ContrtyList();
		Iterator<String>iterator=arrayList.iterator();
		Iterator<String>iterator1=linkList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		while(iterator1.hasNext()){
			System.out.println(iterator1.next());
		}
		ListIterator<String>listIterator=linkList.listIterator();
		while(listIterator.hasNext()){
			newLinkList.add(listIterator.next());
		}
		System.out.println(arrayList);
		System.out.println(linkList);
		System.out.println(newLinkList);
				
	
		

    }
	
}
