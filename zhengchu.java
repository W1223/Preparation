import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int M,N;
        Scanner input=new Scanner(System.in);
        M=input.nextInt();
        N=input.nextInt();
        if(M%N==0&&1<=M&&N<=500)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}