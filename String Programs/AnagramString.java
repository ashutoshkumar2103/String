package Programs;
import java.util.Scanner;
public class AnagramString {

	static int[] noOfOccurance(String st) {
		int count[]=new int[26];
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if(ch>='A' && ch<='Z') {
				count[ch-65]++;
			}
			else if(ch>='a' && ch<='z') {
				count[ch-97]++;
			}
		}
		return count;
	}

	static boolean isAnagram(String st1, String st2) {
		int count1[]=noOfOccurance(st1);
		int count2[]=noOfOccurance(st2);
		for (int i = 0; i < count1.length; i++) {
			if(count1[i]!=count2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String: ");
		String str2 = sc.nextLine();
		boolean res = isAnagram(str1,str2);

		if (res) {
			System.out.println(str1+" is Anagram String");
		}
		else {
			System.out.println(str2+" is not Anagram String");
		}
	}
}


class Anagram1 {

	static boolean areAnagram(String s1, String s2) {
		int c1[] = new int[26];
		for(int i = 0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch>='A' && ch<='Z') {
				c1[ch-65]++;
			}
			else if(ch>='a' && ch<='z') {
				c1[ch-97]++;
			}
		}
		int c2[] = new int[26];
		for(int i = 0; i<s2.length(); i++) {
			char ch = s2.charAt(i);
			if(ch>='A' && ch<='Z') {
				c2[ch-65]++;
			}
			else if(ch>='a' && ch<='z') {
				c2[ch-97]++;
			}
		}
		for(int i=0; i<26; i++) {
			if(c1[i]!=c2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First sentence: ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second Sentence: ");
		String s2 = sc.nextLine();
		boolean br = areAnagram(s1,s2);
		if(br) {
		System.out.println(s1 + "  is a Anagram");
		}
		else
			System.out.println(s2 + " is not a Anagram");
		
	}
}



