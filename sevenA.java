import java.util.Scanner;
public class sevenA{
	public static void main(String[] args){
		int n,q,t=0,total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of processes");
		n=sc.nextInt();
		int[] bt=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter burst time for process "+i);
			bt[i]=sc.nextInt();
			t+=bt[i];		
		}
		total=t;
		System.out.println("Enter the time quanta");
		q=sc.nextInt();
		for(int i=0,c=0;t>0;i=(i+1)%n){
			if(bt[i]==0)
				continue;
			else if(bt[i]<q){
				c=bt[i];bt[i]=0;	
			}
			else{
				c=q;bt[i]-=q;
			}
			t-=c;
			System.out.println("P"+i+"|"+(total-t)+"|");
		}
	}
}
