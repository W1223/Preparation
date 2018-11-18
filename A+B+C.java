import java.util.Scanner;
class Main{
public static void main(String[] args){
    int A,B,C;
    Scanner input=new Scanner(System.in);
    A=input.nextInt();
    B=input.nextInt();
    C=input.nextInt();
    if((A>=-40&&A<=40)&&(B>=-40&&B<=40)&&(C>=-40&&C<=40))
        System.out.print(A+B+C);
    else
        System.out.print("non-compliant");
   } 
}