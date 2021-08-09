package final_calc;

public class rome {
    private static int chars(char a) {
        switch (a) {
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    public static int rome_to_arab(String roman) {
        int result=0;
        String rome = roman.toUpperCase();
        for (int i=0;i<rome.length()-1;i++){
            if(chars(rome.charAt(i))<chars(rome.charAt(i+1))){
                result -= chars(rome.charAt(i));
            }else{
                result+=chars(rome.charAt(i));
            }
        }
        result+=chars(rome.charAt(rome.length()-1));
        return result;

    }

}
