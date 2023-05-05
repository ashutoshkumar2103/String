package Programs;
import java.util.Scanner;
public class ReverseWordAlongWithSentenceToo {

	static String reverseString(String st) {
		String rev="";
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			rev=st.charAt(i)+rev;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence ");
		String str = sc.nextLine();
		str = reverseString(str);
		System.out.println(str);

	}
}