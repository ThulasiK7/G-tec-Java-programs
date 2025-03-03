class Pyramid{
public static void main(String args[]){
for(int i=0;i<=4;i++){
for(int j=i;j<=4;j++){
System.out.print(" ");}

for(int k=1;k<=(4-i-1);k++){
System.out.print("*");}
System.out.println();
}


int n=4;
for(int i=0;i<=n;i++){
for(int j=0;j<n-i;j++){
System.out.print(" ");
for(int k=0;k<=i;k++){
System.out.print("*");
}
System.out.println();}}



}}