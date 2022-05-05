import java.util.*;
public class nineB{
	public static void main(String[] args){
		int n,m,i,j,k,l,r,hit=0;
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
		int[][] b=new int[m][2];
		for(i=0;i<m;i++)
			b[i][0]=b[i][1]=-1;
		System.out.println("============================");
		for(i=0;i<n;i++){
			for(j=0;j<m&&a[i]!=b[j][0];j++);
			if(j==m){
				for(k=0,l=b[k][1],r=0;k<m;k++){
					
					if(l>b[k][1]){
						l=b[k][1];r=k;
					}
				}
				b[r][0]=a[i];b[r][1]=i;
				for(j=0;j<m;j++)
					System.out.println(" \t "+b[j][0]+" \t "+b[j][1]);
			}
			else{
				b[j][1]=i;hit++;
				for(j=0;j<m;j++)
					if(b[j][1]==i)
						System.out.println(" \t "+b[j][0]+" \t "+b[j][1]+"\t Hit");
					else
						System.out.println(" \t "+b[j][0]+" \t "+b[j][1]);
			}
			System.out.println("============================");
		}
		System.out.println("Hits : "+hit+", Faults : "+(n-hit));
		sc.close();
	}
}
