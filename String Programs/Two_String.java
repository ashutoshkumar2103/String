public class Two_String {

	public static void main(String[] args) {
		String s1="govind";
		String s2="Govind";
		String s = twoStrings(s1,s2);
		System.out.println(s);
	}
	public static String twoStrings(String s1, String s2) {
		// Write your code here
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		for(int i=0;i<s1.length();i++){
			for(int j =0;j<s2.length();j++){
				if(ch1[i]==ch2[j]) {
					return "Yes";
				}
			}
		}
		return "No";
	}
}