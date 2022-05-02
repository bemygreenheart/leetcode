package easy;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    private static int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char next = i != s.length() -1 ? s.charAt(i+1) : 0;
            sum += charToInt(s.charAt(i), next);
        }
        return sum;
    }

    private static int charToInt(char current, char next){
        int sign = 1;
        switch(current){
            case 'I':
                if(next == 'V' || next == 'X')
                    sign = - 1;
                return 1 * sign;
            case 'V':
                return 5;
            case 'X':
                if(next == 'L' || next == 'C')
                    sign = - 1;
                return 10 * sign;
            case 'L':
                return 50;
            case 'C':
                if(next == 'D' || next == 'M')
                    sign = - 1;
                return 100 * sign;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("No roman numeral symbol");
        }
    }
}
