import java.util.*;
class Array_secondlargest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] b=new int[5];
for(int i=0;i<5;i++){
b[i]=sc.nextInt();}
Arrays.sort(b);


System.out.print(b[5-2]);


}}
