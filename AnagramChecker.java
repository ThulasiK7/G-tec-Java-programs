import java.util.*;

public class AnagramChecker {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();
str1=str1.toLowerCase();
str2=str2.toLowerCase();
char[] c1=str1.toCharArray();Arrays.sort(c1);
char[] c2=str2.toCharArray();Arrays.sort(c2);
if(Arrays.equals(c1, c2)){
System.out.println("Anagram");}
else{System.out.println("not anagram");}

}}