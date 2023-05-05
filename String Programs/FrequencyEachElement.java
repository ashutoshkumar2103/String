package Programs;
public class FrequencyEachElement {
	public static void main(String[] args) {

		int ar[] = {23,23,23,45,67,89,45,67,34,36,45,89,23};
		boolean br[] = new boolean[ar.length];
		for (int i = 0; i < ar.length; i++) {
			if(br[i]==false) {
				int count=1;
				for (int j = i+1; j < ar.length; j++) {
					if (ar[i]==ar[j]) {
						br[j]=true;
						count++;
					}
				}
				System.out.println(ar[i]+"-->"+count);
			}
		}
	}
}