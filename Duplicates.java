package nithya;

public class Duplicates {

	public static void main(String[] args) {
		
		int[] a= {7,9,8,1,0,2,2};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}

}
