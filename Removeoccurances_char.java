import java.util.Scanner;

 class Removeoccurances_char{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();String s="";
        System.out.print("Enter a char: ");
        char c= scanner.next().charAt(0);
                for(int i=0;i<str.length();i++){
             if(str.charAt(i)!=c){s+=str.charAt(i);}  }
System.out.println(s);



    }
}
