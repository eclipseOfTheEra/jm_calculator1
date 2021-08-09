package final_calc;
import final_calc.main_calc.*;
import java.util.Arrays;
import java.util.regex.*;
public class try_Ex_cach {
    main_calc ma = new main_calc();


    public try_Ex_cach(int a ,int b) throws Ez_Exeption {

        if(a<0||a>10||b<0||b>10){
            throw new Ez_Exeption("Ошибка!Неверный ввод данных.");
        }

    }
    public try_Ex_cach(int a) throws Ez_Exeption {
        if(a<1){
            throw new Ez_Exeption("Ошбика!В римской системе счисления нет отрицательных чисел.");
        }
    }
    public try_Ex_cach(String[] a)throws Ez_Exeption{
        if (a.length !=3 ){
            throw new Ez_Exeption("Ошибка!Должно быть 2 операнта и 1 оператор.");
        }
    }

    }



