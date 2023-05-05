 package Programs;
import java.util.Scanner;
public class PangramString {

	static boolean isPangram(String st) {   //Aashish
		int count[]=new int[26];
		for (int i = 0; i < st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z') {
				count[ch-65]++;
			}
			else if(ch>='a' && ch<='z') {
				count[ch-97]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println((char)(i+65)+ "-->" +count[i]);
			if(count[i]==0) {
				return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence ");
		String str = sc.nextLine();
		boolean res = isPangram(str);
		if(res) {
			System.out.println(str+ " is Pangram");
		}
		else {
			System.out.println(str+ " is not Pangram");
		}
//		System.out.println(str);
	}
}

// OR

class PangramString1 {

	final boolean isPangram(String st) {
		if(st.length()<26) {
			return false;
		}
		st = st.toLowerCase();
		for(char ch='a'; ch<='z'; ch++ ) {  //Shyam
			if(st.indexOf(ch)==-1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence for or part: ");
		String str = sc.nextLine();
		PangramString1 ps = new PangramString1();
		boolean res = ps.isPangram(str);
		if(res) {
			System.out.println(str+ " is Pangram");
		}
		else {
			System.out.println(str+ " is not Pangram");
		}
	}
}