import java.util.LinkedList;
import java.util.List;



public class MainCalling {

	public static void main(String[] args) {
		ListToArray ls=new ListToArray();
		ls.convertToList();
		AddElemant add= new AddElemant();
		List<Integer>list =new LinkedList<Integer>();
		add.addElemant(list,5);
		add.addElemant(list,10);
		add.addElemant(list,15);
		add.addElemant(list,20);
		add.addElemant(list,25);
		MyAbstractChild myabstractchild= new MyAbstractChild();
		myabstractchild.print1();
		
		
		

	}

	
}
