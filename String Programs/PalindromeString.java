package Programs;
import java.util.Scanner;
public class PalindromeString {

	//	static boolean palindromeString(String st) {
	//		boolean res = false;
	//		char ch[]= st.toCharArray();
	//		for (int i = 0; i < ch.length; i++) {
	//			char rev=ch[i];
	//			ch[i] = ch[ch.length-1-i];
	//			ch[ch.length-1-i] = ch[i];
	//		}
	//		String st1 = new String(ch);
	//		if(st.equals(st1)) {
	//			res=true;
	//		}
	//		return res;
	//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence ");
		String str = sc.nextLine();
		boolean rs = palindromeString(str);
		if (rs) {
			System.out.println(str+" is Palindrome String");
		}
		else {
			System.out.println(str+" is not a Palindrome String");
		}
	}

	static boolean palindromeString(String st) {
		st=st.toLowerCase();
		char ch[] = st.toCharArray();
		String str="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==ch[ch.length-1-i]) {
				str=ch[i]+str;
				
			}
		}
		str=str.toLowerCase();
		if(st.equals(str)) {
			return true;
		}
		return false;
	}
}