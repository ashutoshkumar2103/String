package Programs;
import java.util.Scanner;

public class SwappingFirstAndLastCharacter {
	
	static String SwapFirstLast(String st) {
		char ch[] = st.toCharArray();
		int f = 0;
		for(int i=0; i<ch.length; i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
				f=i;
			}
			else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i]==' ') {
				char temp = ch[i];
				ch[i] = ch[f];
				ch[f] = temp;
			}
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String s = sc.nextLine();
		String st = SwapFirstLast(s);
		System.out.println(st);
	}
}