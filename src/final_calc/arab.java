package final_calc;

public class arab {


        int arab1;
        int arab2;
        int result_arab;

        void all(int operant1, int operant2){
            this.arab1=operant1;
            this.arab2=operant2;
        }
        public  int plus(int operant1, int operant2){
            result_arab=operant1+operant2;
            return result_arab;
        }
        public int minus(int operant1, int operant2){
            result_arab=operant1-operant2;
            return result_arab;
        }
        public int delenie(int operant1,int operant2){
            try{result_arab=operant1/operant2;}
            catch (ArithmeticException e){
                System.err.println(e.getMessage());
                System.out.println("На ноль делить нельзя");
            }
            return result_arab;

        }
        public int  umnozhenie(int operant1, int operant2){
            result_arab=operant1*operant2;
            return result_arab;
        }
    }


