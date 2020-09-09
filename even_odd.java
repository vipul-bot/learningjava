import java.util.Scanner;
class even_odd{
int n;
void check(){
Scanner obj=new Scanner(System.in);
System.out.println("enter the number : \n");
n=obj.nextInt();
if(n%2==0){
System.out.println("Even");
}
else{
System.out.println("odd");
}
}
public static void main(String [] args){

even_odd value=new even_odd();
value.check();
}
}