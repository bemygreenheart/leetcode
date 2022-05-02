package easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","glow","flight"};
        System.out.println("Result:    " + longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String chosen = strs[0];
        char c;

        for(int i = 0; i < chosen.length(); i++){
            c = chosen.charAt(i);
            for(String str: strs){
                if(i < str.length() && c != str.charAt(i)){
                    return prefix;
                }
            }
            prefix = prefix + c;
        }
        return prefix;
    }
}
