import java.util.*;
public class ZeroAtEnd {
	
	public static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size = ");
		int n = sc.nextInt();
		System.out.println("Enter elements = ");
		int ar[]=new int[n];

		for(int i=0; i<n; i++) {
			ar[i]=sc.nextInt();
		}
		return ar;
	}

	static void displayArray(int[] ar) {
		System.out.println("Entered Elements are: ");
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]=readArray();
		displayArray(arr);
//		int arr[]= {2,0,9,0,7,8,0,1,4,0,6};
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				al.add(arr[i]);
			}
		}
		for (int i = 0; i < arr .length; i++) {
			if(arr[i]==0) {
				al.add(arr[i]);
			}
		}
		for (int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}