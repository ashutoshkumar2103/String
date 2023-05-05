package Programs;
import java.util.Scanner;
public class StringtoCapital {
	
	static String toCapital(String st) {
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence ");
		String str = sc.nextLine();
		str = toCapital(str);
		System.out.println(str);

	}
}