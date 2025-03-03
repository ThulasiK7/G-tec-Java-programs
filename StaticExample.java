class StaticExample{
StaticExample(){System.out.println("constructor");}//constructor
static void static_ex(){System.out.println("Static method");}
void instance_ex(){System.out.println("instance method");}
public static void main(String args[]){
static_ex();
StaticExample ob=new StaticExample();
ob.instance_ex();
System.out.println("argument values:"+args[0]);
}}