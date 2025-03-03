import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next().toLowerCase(),reversedstr="";
for (int i = s.length() - 1; i >= 0; i--) {
            reversedstr += s.charAt(i);
        }

if(s.equals(reversedstr)){System.out.println("yes");}
else{System.out.println("no");}
}}
