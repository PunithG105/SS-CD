import java.util.*;
public class nineA{
	public static void main(String[] args){
		int n,m,i,j,hit=0,k=0;
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
		int[] frame=new int[m];
		Arrays.fill(frame,-1);
		System.out.println("============================");
		for(i=0;i<n;i++){
			for(j=0;j<m&&a[i]!=frame[j];j++);
			if(j==m){
				frame[k]=a[i];
				k=(k+1)%m;
				System.out.println(frame[0]+" \t "+frame[1]+" \t "+frame[2]);
			}
			else{
				hit++;
				System.out.println(frame[0]+" \t "+frame[1]+" \t "+frame[2]+" \t Hit");
			}
			System.out.println("============================");
		}
		System.out.println("Hits : "+hit+", Faults : "+(n-hit));
		sc.close();
	}
}
