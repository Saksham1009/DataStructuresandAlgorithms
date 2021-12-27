package datatype;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
//		ArrayList al = new ArrayList();
//		al.add("First element");
//		al.add("second element");
//		al.add(3);
//		System.out.println(al);
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
		
//		ArrayList<String> num = new ArrayList();
//		num.add("Saksham");
//		num.add("Yash");
//		System.out.println(num);
//		
//		List(arraylist extends list so list can also be used in place of ArrayList)/ArrayList<Integer> in = new ArrayList();
//		in.add(1);
//		in.add(2);
//		in.add(54);
//		System.out.println(in);
		
		
		
//		Paired<String, Integer> pair1 = new Paired("saksham",96);
//		Paired<Boolean, String> pair2 = new Paired(true,"uvic");
//		
//		pair1.getdesc();
//		pair2.getdesc();
		
		
		
		ArrayList<String> f = new ArrayList();
		ArrayList<String> v = new ArrayList();
		f.add("hi");
		f.add("hello");
		f.add("bye");
		v.add("3");
		v.add("2");
		v.add("1");
//		System.out.println(f);
//		System.out.println(v);
//		f.addAll(v);
//		System.out.println(f);
//		System.out.println(v);
//		System.out.println(f.get(0));
//		f.set(0, "no");
//		System.out.println(f);
//		f.remove(0);
//		System.out.println(f);
//		
		f.addAll(v);
		System.out.println(f);
		f.removeAll(v);
		System.out.println(f);
		f.addAll(v);
		ArrayList<String> t = new ArrayList();
		t.add("hello");
		t.add("3");
		f.removeAll(t);
		System.out.println(f);
		f.clear();
		System.out.println(f);
		System.out.println(f.isEmpty());
		System.out.println(v.size());
		System.out.println(v.contains("2"));
		String[] temo = new String[v.size()];
		v.toArray(temo);
		System.out.println(temo);
		
		
		
		
		
		
	}

}
