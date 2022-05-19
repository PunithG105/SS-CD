import java.util.*;
public class nineA{
	public static void main(String[] args){
		int n,m,i,j,hit=0,k=0,l=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of inputs");
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++){
			System.out.print("a["+i+"] : ");
			a[i]=sc.nextInt();
			System.out.println();
		}
		System.out.println("Enter the frame size");
		m=sc.nextInt();
		int[][] frame=new int[m][2];
		for(i=0;i<m;i++){
			frame[i][0]=-1;
			frame[i][1]=-1;
		}
		System.out.println("============================");
		for(i=0;i<n;i++){
			for(j=0,l=0;j<m&&a[i]!=frame[j][0];j++)
				if(frame[l][1]>frame[j][1])
					l=j;
			if(j==m){
				frame[l][0]=a[i];
				frame[l][1]=i;
				System.out.println(frame[0][0]+"("+frame[0][1]+")"+" \t "+frame[1][0]+"("+frame[1][1]+")"+" \t "+frame[2][0]+"("+frame[2][1]+")");
			}
			else{
				hit++;
				frame[j][1]=i;
				System.out.println(frame[0][0]+"("+frame[0][1]+")"+" \t "+frame[1][0]+"("+frame[1][1]+")"+" \t "+frame[2][0]+"("+frame[2][1]+")"+" \t Hit");
			}
			System.out.println("============================");
		}
		System.out.println("Hits : "+hit+", Faults : "+(n-hit));
		sc.close();
	}
}
