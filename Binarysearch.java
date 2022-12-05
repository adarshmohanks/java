import java.util.*;
class Binarysearch{
public static void sort(int A[],int n,int j){
	for(int i=0;i<n;i++){
		if (A[j]<A[i]){
			int temp=A[i];
			A[i]=A[j];
			A[j]=temp;
			}
		}
	}
public static void Binsearch(int A[],int key,int f, int l){
	int m=(f+l)/2;
	if(A[m]==key){
		System.out.println("Key id present at"+m);
		}
	else if (l==f){
		System.out.println("Key is not present");
		}
	else{
		Binsearch(A,key,0,m-1);
		}
	}
public static void main(String args[]){
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the number of elements: ");
	int n=sc.nextInt();
	int A[]=new int[n];
	System.out.println("Enter the numbers: ");
	for (int i=0; i<n; i++){
		A[i]=sc.nextInt();
		}
	sort(A,n);
	System.out.println("Enter the key: ");
	int key= sc.nextInt();
	for (int i=0; i<n; i++){
		System.out.println(A[i]);
		}
	Binsearch(A,key,0,n-1);
	}
}
