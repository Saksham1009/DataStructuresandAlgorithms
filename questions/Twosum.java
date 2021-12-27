package questions;

public class Twosum {

	public static void main(String[] args) {
		
		int[] a = new int[4];
		int[] b = new int[5];
		int current;
		int v=7;
		boolean y = false;
		for(int i=0;i<a.length;i++) {
			a[i]=i;
		}
		for(int i=0;i<b.length;i++) {
			b[i]=i;
		}
		
		for (int j=0;j<a.length;j++) {
			current=j;
			for(int k=0;k<b.length;k++) {
				if (a[current]+b[k]==v) {
					y=true;
					break;
				}
			}
		}
		if(y) {
			System.out.println(v+" found!");
		}else {
			System.out.println(v+" not found!");
		}
	}

}
