class Solution {
    private boolean isGood(String word, String chars) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(char c: word.toCharArray()) {
            freq1[c-'a']++;
        }
        for(char c: chars.toCharArray()) {
            freq2[c-'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if (freq1[i] > freq2[i]) {
                return false;
            }
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        for(String word: words) {
            if (isGood(word, chars)) {
                sum += word.length();
            }
        }
        return sum;
    }
}