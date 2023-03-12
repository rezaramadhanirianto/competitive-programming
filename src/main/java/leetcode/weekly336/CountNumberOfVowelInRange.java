package leetcode.weekly336;

// https://leetcode.com/contest/weekly-contest-336/problems/count-the-number-of-vowel-strings-in-range/
public class CountNumberOfVowelInRange {
    public int vowelStrings(String[] words, int left, int right) {
        int res = 0;
        for(int i = left; i <= right; i++){
            String word = words[i];
            char start = word.charAt(0);
            char end = word.charAt(word.length()-1);
            if((start == 'a' || start == 'e' || start == 'i' || start == 'u' || start == 'o') &&
                    (end == 'a' || end == 'e' || end == 'i' || end == 'u' || end == 'o')
            ){

                res++;
            }
        }
        return res;
    }
}
