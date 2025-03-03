import java.util.*;
class Main{
public static void main(String args[]){
String str="Hello";
String s="Hello";String s1=new String("Hello");
System.out.print(str.equals(s));System.out.println(s==s1);
System.out.println(s1.equals(s));int count=0;
for(int i=0;i<s.length();i++){if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ){count++;
System.out.println(s.charAt(i)+" "+count);}}






}}
