package strings;

public class ReversingWords {

	public static void main(String[] args) {
		String name= "      yash is          a    boy    ";
		String jo = "";
		
		
		//method 1
		
//		String you[]=name.split(" ");
//		for (int i=you.length-1;i>=0;i--) {
//			
//			System.out.print(you[i]+ " ");
//			
//		}
		
		//method 2
		int i = (name.length()-1);
		int j = 0;
		while(i>=0) {
			while (i>=0 && name.charAt(i)==' ') {
				i--;
				
			}
			if(i<0) break;
			j = i;
			while (i>=0 && name.charAt(i)!=' ') {
				i--;
			}
		if (jo.isEmpty()) {
			jo+=name.substring(i+1,j+1);
		}else {
		jo+=" "+name.substring(i+1, j+1);
		}
		}
		
	System.out.println(jo);
	}
	

}
