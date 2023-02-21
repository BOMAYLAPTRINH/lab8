package bai3;

public class StringUtil {
    public static void main(String[] args) {
        String s = "nguyen van teo";
        String result = StringUtil.toUpperFirstChar(s);
        System.out.println(result);
    }

    public static String toUpperFirstChar(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                result.append(firstChar).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }
}
