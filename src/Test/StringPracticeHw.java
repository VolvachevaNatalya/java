package Test;

public class StringPracticeHw {
    public static String getStrReverse(String str) {
        String rev = "";
        if (str == null) {
            return null;
        } else if (str.trim().isEmpty()) {
            return null;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev.trim();
    }

    public static Integer getCountWords(String sent, String word) {
        if (sent == null || word == null) {
            return null;
        } else if (sent.trim().isEmpty() || word.trim().isEmpty()) {
            return null;
        }
        int count = 0;
        String[] strs = sent.split(" ");
        for (int i = 0; i <strs.length ; i++) {
            if(strs[i].toLowerCase().equals(word.trim().toLowerCase())) {
                count ++;
            }
        }
        return count;

    }

}

