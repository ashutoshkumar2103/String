// here sum are done of numbers and not digit take ex as 1ab2c23 here ans is 25 as 23 is treated as single number and not two digit so ans 8 is wrong
import java.util.Scanner;
public class SumOfNumberString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here: ");
		String str = sc.next(), temp="";
//		String str="11ab16c23a5",temp="";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				temp=temp+ch;
			}
			else {
				sum=sum+(Integer.parseInt(temp));
				temp="0";
			}
		}
		System.out.println(sum+Integer.parseInt(temp));
	}
}