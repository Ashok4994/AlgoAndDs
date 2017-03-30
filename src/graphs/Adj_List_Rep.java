package graphs;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Adj_List_Rep {
	Map<Integer,List<Integer>> adj_list;
	
	public Adj_List_Rep() {
		adj_list =new HashMap<Integer,List<Integer>>();
		
		}
	public void makeEdge(int to,int from) {
		List<Integer> l1=adj_list.get(to);
		l1.add(from);
		List<Integer> l2=adj_list.get(from);
		l2.add(to);
		
	}
	
	public List<Integer> getEdge(int to) {
		return adj_list.get(to);
	}

			
	}
	

