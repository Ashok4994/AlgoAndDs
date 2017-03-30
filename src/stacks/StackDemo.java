package stacks;
import java.util.*;
public class StackDemo {
	public static void main(String[] args) {
Stack<Integer> st=new Stack<Integer>();
st.push(10);
st.push(20);
st.push(30);
st.push(40);
System.out.println(st.pop());
System.out.println(st.peek());
System.out.println(st);
System.out.println(st.toString());
System.out.println(st);
System.out.println("Is stack empty"+st.isEmpty());
	}
}
