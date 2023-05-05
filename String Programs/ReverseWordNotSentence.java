package Programs;
import java.util.Scanner;
public class ReverseWordNotSentence {
	
	static String reverseWordInSentence(String st) {
		char ch[]=st.toCharArray();
		String rev = "";
		for (int i = 0; i < ch.length; i++) {
			int x=i;
			while(i<ch.length && ch[i]!=' ') {
				i++;
			}
			int j=i-1;
			while(j>=x) {
				rev = rev+ch[j];
				j--;
			}
			if(i<ch.length) {
				rev = rev+ch[i];
			}
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String str = sc.nextLine();
		str = reverseWordInSentence(str);
		System.out.println(str);
	}
}