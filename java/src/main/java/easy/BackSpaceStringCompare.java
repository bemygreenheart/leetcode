package easy;

public class BackSpaceStringCompare {

    public static void main(String[] args) {
        String s, t;

        s = "ab#c"; t = "ad#c";
        System.out.println(backspaceCompare(s, t));

        s = "ab##"; t = "c#d#";
        System.out.println(backspaceCompare(s, t));

        s = "a##c"; t = "#a#c";
        System.out.println(backspaceCompare(s, t));

        s = "y#fo##f"; t = "y#f#o##f";
        System.out.println(backspaceCompare(s, t));

        s = "j##xfix"; t = "j###xfix";
        System.out.println(backspaceCompare(s, t));

    }

    private static boolean backspaceCompare(String s, String t) {
        return cleaner(s).equals(cleaner(t));
    }

    private static String cleaner(String input){
        StringBuilder flexInput = new StringBuilder(input);
        for(int i = 0; i<flexInput.length(); i++){
            if(flexInput.charAt(i) == '#'){
                if(i == 0){
                    flexInput.deleteCharAt(0);
                    i--;
                }
                else{
                    flexInput.delete(i - 1, i + 1);
                    i -= 2;
                }
            }
        }

        return flexInput.toString();
    }
}
