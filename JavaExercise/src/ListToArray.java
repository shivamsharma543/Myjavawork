import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;

public class ListToArray {
    String name=" ";
    int rollnum=0;
    public ListToArray(){
    }
    
public ListToArray(String name,int rollnum){
    this.name=name;
    this.rollnum=rollnum;
    
}

public String toString() {
    return String.format("Name is "+name+"  Rollnum is  "+ rollnum);
}
public void convertToList(){
    ListToArray ls1=new ListToArray("naveen",1);
    ListToArray ls2=new ListToArray("akash",2);
    ListToArray ls3=new ListToArray("ajay",3);
    ListToArray ls4=new ListToArray("rahul",4);
    ListToArray ls5=new ListToArray("sumit",5);
    ListToArray ls6=new ListToArray("anup",6);
    
    ListToArray[] myarray= {ls1,ls2,ls3,ls4,ls5,ls6};
    ArrayList<ListToArray>ls=new ArrayList<ListToArray>(Arrays.asList(myarray));
    int start=2;
    int end=5;
    List<ListToArray>subls=ls.subList(start,end);
      for(int i=start;i<=end;i++) {
          ls.remove(i);
      }
      for(Object object:ls) {
          System.out.println(object.toString());
         
      }
      for(Object object1:subls) {
          System.out.println(object1.toString());
          
      }
    
   
    
} 
}