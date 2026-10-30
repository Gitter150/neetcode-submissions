class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char, int> freq1, freq2;
        if(s.size() != t.size()) return false;
        int n = s.size();
        for(int i = 0; i < n; i++) {
            freq1[s[i]]++;
            freq2[t[i]]++;
        }
        return freq1 == freq2;
    }
};
