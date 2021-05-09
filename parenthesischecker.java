/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

class parenthesischecker {
    static void charstring(String A){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<A.length();i++)
        {
          if(A.charAt(i)=='{' || A.charAt(i)=='(' || A.charAt(i)=='[')
          {
              st.push(A.charAt(i));
          }
          else if(A.charAt(i)=='}')
          {
              if(st.peek()=='{')
              {
                  st.pop();
                  
              }
              else
              {
                  System.out.println("not balanced");
                  System.exit(0);
              }
          }
          else if(A.charAt(i)==')')
          {
              if(st.peek()=='(')
              {
                  st.pop();
              }
              else
              {
                  System.out.println("not balanced");
                  System.exit(0);
              }
          }
          else if(A.charAt(i)==']')
          {
              if(st.peek()=='[')
              {
                  st.pop();
              }
              else
              {
                  System.out.println("not balanced");
                  System.exit(0);
              }
          }
        }
        if(st.size()==0)
        {
            System.out.println("balanced");
        }
        else
        {
            System.out.println("not balanced");
        }
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
		    //int N=sc.nextInt();
		    String A=sc.next();		    
		    charstring(A);
		    T--;
		}
	}
}