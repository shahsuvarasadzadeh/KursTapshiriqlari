package KursTapshiriqlari;

import java.util.Scanner;
import MathUtil.Methods;
public class ChangeTwoArgs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ilk ededi daxil edin");
        int a= sc.nextInt();
        System.out.println("2-ci ededi daxil edin");
        int b= sc.nextInt();
        Methods.changeargs(a,b);


    }

}
