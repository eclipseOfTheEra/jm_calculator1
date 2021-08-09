package final_calc;
import final_calc.*;
import java.util.Scanner;
import java.util.regex.*;

public class main_calc {

    private  static int operator1;
    private static int operator2;
    private static String operant;
    private static String rome_operator1_string;
    private static String rome_operator2_string;
    private static int rome_operator1_int;
    private static int rome_operator2_int;
    private static int result_int;
    private static String result_string;

    static Scanner scan = new Scanner(System.in);
    static String input = scan.nextLine();
    static String[] pars_in = input.split(" ");



    public static void main(String[] args) throws Ez_Exeption {
        arab ar = new arab();
        final_calc.isArab input_arab = new isArab();
        final_calc.isRoman input_roman = new isRoman();


        boolean its_arab = false;
        boolean its_arab2 = false;
        boolean its_roman = false;
        boolean its_roman2 = false;
        while (!input.isEmpty()) {
            its_arab = input_arab.isArab(pars_in[0]);
            its_arab2 = input_arab.isArab(pars_in[2]);
            its_roman = input_roman.isRoman(pars_in[0]);
            its_roman2 = input_roman.isRoman(pars_in[2]);


            if (its_roman==true & its_roman2==true) {
                try_Ex_cach eee = new try_Ex_cach(pars_in);

                rome_operator1_string = pars_in[0];
                rome_operator2_string = pars_in[2];
                rome_operator1_int = rome.rome_to_arab(pars_in[0]);
                rome_operator2_int = rome.rome_to_arab(pars_in[2]);
                operant = pars_in[1];
                if (operant.contains("+")) {
                    System.out.println(arab_to_rome.toRoman(ar.plus(rome_operator1_int, rome_operator2_int)));
                    break;
                }
                if (operant.contains("-")) {
                    try_Ex_cach ex_rome_minus = new try_Ex_cach(result_int);
                    System.out.println(arab_to_rome.toRoman(ar.minus(rome_operator1_int, rome_operator2_int)));
                    break;
                }
                if (operant.contains("*")) {
                    System.out.println(arab_to_rome.toRoman(ar.umnozhenie(rome_operator1_int, rome_operator2_int)));
                    break;
                }
                if (operant.contains("/") || operant.contains(":")) {
                    System.out.println(arab_to_rome.toRoman(ar.delenie(rome_operator1_int, rome_operator2_int)));
                    break;
                }
            }
            if (its_arab==true & its_arab2==true) {

                operator1 = Integer.parseInt(pars_in[0]);
                operator2 = Integer.parseInt((pars_in[2]));
                operant = pars_in[1];

                try_Ex_cach ex = new try_Ex_cach(operator1, operator2);


                if (operant.contains("+")) {
                    System.out.println(ar.plus(operator1, operator2));
                    break;
                }
                if (operant.contains("-")) {
                    System.out.println(ar.minus(operator1, operator2));
                    break;
                }
                if (operant.contains("*")) {
                    System.out.println(ar.umnozhenie(operator1, operator2));
                    break;
                }
                if (operant.contains("/") || operant.contains(":")) {
                    System.out.println(ar.delenie(operator1, operator2));
                    break;
                }
            }
        }

    }
}

