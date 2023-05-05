package Programs;
import java.util.Scanner;
public class ReverseSentenceNotWord {

	static String reverseSentence(String st) {
		char ch[]=st.toCharArray();
		String rev = "";
		for (int i=ch.length-1; i>=0; i--) {
			int x=i;
			while(i>=0 && ch[i]!=' ') {
				i--;
			}
			int j=i+1;
			while(j<=x) {
				rev = rev+ch[j];
				j++;
			}
			if(i>0) {
				rev = rev+ch[i];
			}
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String str = sc.nextLine();
		str = reverseSentence(str);
		System.out.println(str);
	}
}
