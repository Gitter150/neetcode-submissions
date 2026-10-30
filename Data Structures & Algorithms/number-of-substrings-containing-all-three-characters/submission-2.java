class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0, right = 0;
        int count = 0;
        int n = s.length();
        int[] countMap = new int[3];
        for(; right < n; right++) {
            countMap[s.charAt(right) - 'a']++;
            while (countMap[0] > 0 && countMap[1] > 0 && countMap[2] > 0) {
                count += n - right;
                countMap[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }
}