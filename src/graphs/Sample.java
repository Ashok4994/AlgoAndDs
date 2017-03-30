package graphs;

import java.util.List;
import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
		
		int v,e,count=1;
		int to,from;
		Adj_List_Rep adj_l=new Adj_List_Rep();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		v=sc.nextInt();
		System.out.println("Enter the number of edges");
		e=sc.nextInt();
		System.out.println("Enter the edges");
		while(count<=e) {
			to=sc.nextInt();
			from=sc.nextInt();
			adj_l.makeEdge(to,from);
			count++;
		}
		System.out.println("The Adjacency list representation is :");
		for(int i=1;i<v;i++) {
			System.out.println(i+"->");
			List<Integer> l=adj_l.getEdge(i);
			for(int j=1;j<l.size();j++) {
			
				System.out.print(l.get(j - 1) + " -> ");
				
			}
			}
		}	
}
