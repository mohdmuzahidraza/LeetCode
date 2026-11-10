class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;

        while (i < j) {
            while (i < j && !"aeiouAEIOU".contains(ch[i] + "")){
                i++;
            }
            while (i < j && !"aeiouAEIOU".contains(ch[j] + "")){
                j--;
            }

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        return new String(ch);
    }
}