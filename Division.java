import java.util.*;
class Division{
int num;
int getnum(){return num;}
void setnum(int var){
if(var==0){num=10;}
else{num=var;}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
Division d=new Division();
d.setnum(num2);
d.getnum();
System.out.println(num1/d.num);
}} 