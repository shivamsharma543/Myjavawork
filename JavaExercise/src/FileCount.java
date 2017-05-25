import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import static java.nio.file.StandardOpenOption.*;

public class FileCount {

	public Map<String, List<Integer>> findString() {
		List<Integer> ls = new ArrayList<Integer>();
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		Path file = Paths.get("datafiles/textfiles");

		try {
			Files.createDirectories(file);
			Path mypath = Paths.get("datafiles/textfiles", "shivam.txt");
			BufferedReader br = Files.newBufferedReader(mypath);
			String string = " ";
			int count = 0;
			int position = 0;
			while ((string = br.readLine()) != null) {
				String[] array = string.split("\\s");
				for (String str : array) {
					if (count == 0) {
						ls.add(0);
						ls.add(str.length());
					} else {
						ls.add(position);
						ls.add(str.length());

					}
					position = position + str.length() + 1;
					map.put(str, ls);
					count++;

				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return map;

	}
}
