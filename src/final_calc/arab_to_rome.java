package final_calc;
import java.util.TreeMap;

public class arab_to_rome {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final static String toRoman(int number) {
        int ar=map.floorKey(number);
        if (number==ar) {
            return map.get(number);
        }
        return map.get(ar)+toRoman(number-ar);
    }
}
