//school result
import java.util.Scanner;                         //60,45,33,sorry you fail
class result{
int x;
void out_result(){
Scanner obj=new Scanner(System.in);
System.out.println("Enter your marks : ");
x=obj.nextInt();
if (x>=60){
System.out.println("First division : "+x);
}
else if (x>=45){
System.out.println("Second division : "+x);
}
else if (x>=33){
System.out.println("Third division : "+x);
}
else{
System.out.println("Sorry !! You Failed ... PS : Try Next Time");
}
}
public static void main(String [] args){
result out=new result();
out.out_result();
}
}

