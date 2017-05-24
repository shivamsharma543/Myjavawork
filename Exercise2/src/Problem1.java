import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {

	Map<Character, Integer> mymap = new HashMap<Character, Integer>();

	public void occurenceOfCharacter() {
		Path file = Paths.get("datafiles/textfiles");
		try {
			Files.createDirectories(file);
			Path mypath = Paths.get("datafiles/textfiles", "shivam.txt");
			BufferedWriter bw=Files.newBufferedWriter(mypath);
			BufferedReader br = Files.newBufferedReader(mypath);
			String string="I am learning java";
			bw.write(string,0,string.length());
			String string1="Java is bit tough but intresting";
			bw.write(string1,0,string1.length());
			bw.flush();
			String str = "";
			int value = 1;
			while ((str = br.readLine()) != null) {
				      str.toLowerCase();
				      System.out.println(str);
				for (int i = 0; i < str.length(); i++) {
					if (mymap.containsKey(str.charAt(i)))
						mymap.put(str.charAt(i), value + 1);
					else
						mymap.put(str.charAt(i), value);
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(mymap);
	}
}
