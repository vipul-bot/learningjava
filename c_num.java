import java.util.Scanner;
class c_num{
//static int x=10;
int x;
void check(){
Scanner obj = new Scanner(System.in);
System.out.println("Enter the number to be checked : ");
x=obj.nextInt();
if(x>0){
System.out.println("Possitive number : "+x);
}
else if(x==0){
System.out.println("EQUALS ZERO");
}
else{
System.out.println("Negative Number : "+x);
}
}
public static void main(String [] args){
c_num O=new c_num();
O.check();
//System.out.println(x);
}
}


