package hashmaps;
import java.util.HashMap;

public class Intro {
	
	public static void main(String[] args) {
		HashMap<String,String> nhash = new HashMap<String, String>();
		nhash.put("Hello", "World");
		nhash.put("This", "name");
		System.out.println(nhash);
		System.out.println(nhash.get("Hello"));
		nhash.remove("Hello");
		System.out.println(nhash.get("Hello"));
		System.out.println(nhash.get("This"));
		nhash.put("Second", "number");
		System.out.println(nhash);
		nhash.clear();
		System.out.println(nhash);
		System.out.println(nhash.size());
		nhash.put("Focus", "Now");
		System.out.println(nhash.size());
		nhash.put("THis", "isgood");
		for(String i: nhash.keySet()) {
			System.out.print(i+" "+nhash.get(i));
		}
	}

}
