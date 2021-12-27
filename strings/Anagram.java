package strings;

public class Anagram {

	public static void main(String[] args) {
		String a = "aabcc";
		String b = "abade";
//		boolean jj = false;
//		boolean vis[] = new boolean[b.length()];
//		if (a.length()==b.length()) {
//			
//		
//		for (int i = 0;i<a.length();i++) {
//			char u = a.charAt(i);
//			jj =false;
//			for (int j=0;j<b.length();j++) {
//				
//				if (b.charAt(j)==u && !vis[j]) {
//					vis[j] = true;
//					jj = true;
//					break;
//					
//				} 
//			}
//			if (!jj) {
//					
//				break;
//				
//					
//				}
//		
//			
//			
//				
//		}
//			
//			
//			
//		
//		if (jj==true) {
//					
//					System.out.println("It is an anagram ");
//					
//				}else {
//					
//					
//					System.out.println("It is not an anagram ");
//				}
//		}else {
//			System.out.println("not an anagram(size)");
//		}		
		
		
		
		//effective
		
		
//		int[] k = new int[256];
//		int[] m = new int[256];
//		boolean jj = true;
//		for (int c: a.toCharArray()) {
//			
//			int index =c;
//			k[index]++;
//			
//		}
//		for(int c: b.toCharArray()) {
//			
//			int index = c;
//			m[index]++;
//			
//			
//		}
//		
//		for (int i=0;i<256;i++) {
//			if (k[i]!=m[i]) {
//				jj = false;
//				break;
//				
//			}
//		}
//		if(jj) {
//			
//			System.out.println("It is an anagram");
//		}else {
//			
//			System.out.println("it is not an anagram");
//			
//		}
		
		
		
		//most effective
		
		
		
		
		int al[] = new int[256];
		boolean jj = true;
		
		
		for(int c: a.toCharArray()) {
			
			int index =c;
			al[index]++;
			
			
		}
		for(int c: b.toCharArray()) {
			
			int index = c;
			al[index]--;
			
			
		}
		
		
		for (int i=0;i<256;i++) {
			
			if (al[i]!=0) {
				jj = false;
				break;
			}
		}
		if (jj) {
			
			System.out.println("Anagram");
			
		}else {
			System.out.println("not anagram");
		}
		
		
		
		}
	}


