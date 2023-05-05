import java.util.Scanner;
public class Occurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Pattern: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the no of times you want to repeat pattern: ");
		int repeatation= sc.nextInt();
		System.out.println("Enter the length upto which you want to know repeatation of Character: ");
		int upto = sc.nextInt();
		System.out.println("Enter the Character you want to check no of times repeated: ");
		char chr = sc.next().charAt(0);
		int count=0;
		String str = "";
		for (int i = 0; i<repeatation ; i++) {
			str=str+s1;
		}
		for(int i=0;i<upto;i++) {
			char ch = str.charAt(i);
			if(ch==chr) {
				count++;
			}
		}
		System.out.println("Number of times "+chr+" repeated: "+count);
		sc.close();
	}
}