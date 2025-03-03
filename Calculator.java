import java.util.*;
class Calculator{
public static int add(int a , int b){return a+b;}
public static int sub(int a,int b){return a-b;}
public static int mul(int a,int b){return a*b;}
public static int div(int a,int b){return a/b;}
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int x=add(a,b);
int y=sub(a,b);
int z=mul(a,b);
int c=div(a,b);
		System.out.print(x+" sub" +y+"mul"+z+" div"+c );
}}