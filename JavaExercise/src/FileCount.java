import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import  static java.nio.file.StandardOpenOption.*;


public class FileCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileCount filecount=new FileCount();
		 filecount.findString();
		 System.out.println(filecount.findString());
       
	}
	
    public Map<String,List<Integer>> findString() {
    	List<Integer>ls=new ArrayList<Integer>();
    	Map<String,List<Integer>> map=new HashMap<String,List<Integer>>();
    	Path file = Paths.get("datafiles/textfiles");
    	    	
    	try {
			Files.createDirectories(file);
			Path mypath=Paths.get("datafiles/textfiles", "shivam.txt");
			BufferedReader br=Files.newBufferedReader(mypath);
			String string=" ";
			int length=0;
			int addinglength=0;
			while((string=br.readLine())!=null){
			    
				ls.add(length);
				addinglength=string.length();
				length+=addinglength;
				map.put(string,ls);
			}
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
       return map;
    	
    }
}
