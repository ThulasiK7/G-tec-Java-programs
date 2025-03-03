class Person{
private String name;
//setter
void setname(String newname){name=newname;}
//getter
String getname(){return name;}
}
public class Main{
public static void main(String args[]){
Person p=new Person();
p.setname("Alice");
System.out.println(p.getname());
}}
