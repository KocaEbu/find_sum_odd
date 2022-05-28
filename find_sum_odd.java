import java.util.Scanner;

public class find_sum_odd {
    public static void main(String[] args) {
        double n;
        double sum=0;

        Scanner input=new Scanner(System.in);

        System.out.println("*****Program girdiginiz tum pozitif tam sayilari toplar negatif tam sayi girince program sonlanir. *****");

        do {
            System.out.print("Lutfen bir tam sayi giriniz: ");
            n= input.nextDouble();

            if(n%2==0 && n%4==0){

                sum=sum+n;

            }

        }while(n>0);

        System.out.println("Simdiye kadar girmis oldugunuz sayilarin toplami: "+sum);


    }
}
