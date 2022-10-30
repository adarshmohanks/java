import java.util.*;
class frequency{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the word.");
		String word=sc.nextLine();
		System.out.println("Enter the character.");
		char c=sc.next().charAt(0);
		int length=word.length();
		for(int i=0;i<length;i++){
			if(word.charAt(i)==c)
			count++;
		}
		System.out.println("Frequency is " +count);
	}
}
