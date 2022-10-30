import java.util.*;
class palindrome {
	public static void main (String [] args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string to check palindrome.");
		String word=sc.nextLine();
		int length=word.length();
		int i=0;
		int j=length-1;
		int flag=0;
		while (i<j){
			if(word.charAt(i)!=word.charAt(j)){
				System.out.println(word+" is not palindrome."); 
				flag++;
				break;
			}
			if(flag==0){
				System.out.println(word+" is palindrome.");
				break;
			}
		}
	}
}
