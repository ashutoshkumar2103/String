package Programs;
import java.util.Iterator;
import java.util.Scanner;

public class VoweltoSmallLtetter {

	/*static String vowelToLower(String st) {
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				ch[i]=(char)(ch[i]);
			}
			else if(ch[i]>='A' && ch[i]<='Z') {
				ch[i] = (char)(ch[i]);
			}
			else {
				ch[i] = (char)(ch[i]-32);
			}
		}
		return new String(ch);
	}*/
	
	static String vowelToLower(String st) {
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>='a' && ch[i]<='z') {
				if((ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')==false) {
					ch[i]=(char)(ch[i]-32);
				}
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence ");
		String str = sc.nextLine();
		str = vowelToLower(str);
		System.out.println(str);
	}
}