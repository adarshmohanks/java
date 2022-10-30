import java.util.*;
public class multimetrix{
	public static void main(String [] args){
		int r1,r2,c1,c2,i,j,k;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of rows of first matrix. ");
		r1=sc.nextInt();
		System.out.println("Enter the number of columns of first matrix. ");
        c1=sc.nextInt();
        System.out.println("Enter the number of rows of second matrix. ");
        r2=sc.nextInt();
        System.out.println("Enter the number of columns of second matrix. ");
        c2=sc.nextInt();
		if (c1!=r2)
		System.out.println("Matrix multiplication not possible.");
		else{
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int c[][]=new int[r1][c2];
			System.out.println("Enter the values of matrix A:");
			for (i=0;i<r1;i++){
				for(j=0;j<c1;j++)
				a[i][j]=sc.nextInt();
			}
			System.out.println ("Enter values for matrix B:");
			for (i=0;i<r2;i++){
				for(j=0;j<c2;j++)
				b[i][j]=sc.nextInt();
			}
			System.out.println("Matrix multiplication.");
			for (i=0;i<r1;i++){
				for(j=0;j<c2;j++){
					c[i][j]=0;
					for (k=0;k<c1;k++){
						c[i][j]=a[i][k]*b[k][i];
					}
					System.out.print(c[i][j]+"");
				}
				System.out.println();
			}
		}
	}
}
