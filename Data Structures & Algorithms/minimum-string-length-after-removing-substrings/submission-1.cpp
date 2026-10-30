class Solution {
public:
    int minLength(string s) {
        // AABCDBABABCABD
        unordered_map<char, char> mp = {
            {'D', 'C'},
            {'B', 'A'},
        };

        stack<char> stk;

        for(char c: s) {
            if (stk.empty()) {
                stk.push(c);
            } else {
                if (mp.contains(c) && mp[c] == stk.top()) {
                    stk.pop();
                } else {
                    stk.push(c);
                }
            }
        }

        return stk.size();
    }
};
