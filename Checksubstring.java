import java.util.Scanner;

public class Checksubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.print("Enter a string: ");
        String sub = scanner.next();
                
             if(str.contains(sub)){System.out.println("yes");}  
else{System.out.println("no");}


    }
}
