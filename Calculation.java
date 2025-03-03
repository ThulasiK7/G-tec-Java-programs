import java.util.*;
class Calculation{
public static int add(int a , int b){return a+b;}
public static int sub(int a,int b){return a-b;}
public static int mul(int a,int b){return a*b;}
public static int div(int a,int b){return a/b;}
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter choice: 1.add 2.sub 3.mul 4.div");
int c=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
if(c==1){System.out.print(add(a,b) );}
else if(c==2){System.out.print(sub(a,b) );}
else if(c==3){System.out.print(mul(a,b) );}
else{System.out.print(div(a,b) );}		
}}