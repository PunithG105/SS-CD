import java.util.Scanner;
public class sevenB{
	public static void main(String[] args){
		int i,n,c,j=0,t=0,total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of processes");
		n=sc.nextInt();
		int[] bt=new int[n];
		for(i=0;i<n;i++){
			System.out.println("Enter burst time for process "+i);
			bt[i]=sc.nextInt();
			t+=bt[i];		
		}
		total=t;
		while(t>0){
			for(i=0,c=999;i<n;i++)
				if(bt[i]!=0&&c>bt[i])
					{c=bt[i];j=i;}
			t-=c;bt[j]=0;
			System.out.println("P"+j+"|"+(total-t)+"|");
		}
	}
}
