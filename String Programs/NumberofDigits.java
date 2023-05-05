package Programs;
import java.util.Scanner;
public class NumberofDigits {
	static int noOfDigits(String st) {
		String d = "0123456789";
		int count=0;
		for (int i=0; i<st.length(); i++) {
			char ch = st.charAt(i);
			if(d.indexOf(ch)>=0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence ");
		String str = sc.nextLine();
		System.out.println("Number of Digits are : "+noOfDigits(str));
	}
}

class NumberofDigits1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence = ");
		String str = sc.nextLine();
		int dc=0;
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				dc++;
			}
		}
		System.out.println("Number of Digits here are : "+dc);
	}
}