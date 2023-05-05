package Programs;
public class NoComparisonEachOtherElementCountFrequency {
	public static void main(String[] args) {
		int ar[]= {23,34,23,44,56,87};
		int big = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]>big) {
				big=ar[i];
			}
		}
		int count[]=new int[big+1];
		for (int i = 0; i < ar.length; i++) {
			count[ar[i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i]!=0) {
				System.out.println(i+"-->"+count[i]);
			}
		}		
	}
}