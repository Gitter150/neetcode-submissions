class Solution {
    private boolean isGood(String num) {
        return num.charAt(0) == num.charAt(1) 
        && num.charAt(1) == num.charAt(2);
    }
    public String largestGoodInteger(String num) {
        String res = "";
        int max = -1;
        for(int i = 0; i < num.length() - 2; i++) {
            String sub = num.substring(i, i + 3);
            int curr = sub.charAt(0) - '0';
            if (isGood(sub)) {
                if (max == -1 || curr > max) {
                    max = curr;
                    res = sub;
                }
            }
        }

        return res;
    }
}