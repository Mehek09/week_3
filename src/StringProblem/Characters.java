package StringProblem;

public class Characters {
    public static String moveSC(String str) {
        char[] characters = str.toCharArray();
        int len = characters.length;
        int j = 0;

        for (int i = 0; i < len; i++) {
            if (Character.isAlphabetic(characters[i])) {
                if (i != j) {
                    char temp = characters[j];
                    characters[j] = characters[i];
                    characters[i] = temp;
                }
                j++;
            } 
        }

        return new String(characters);
    }

    public static void main(String[] args) {
        String str = "He@#$llo!*&";
        System.out.println(moveSC(str));
    }
}