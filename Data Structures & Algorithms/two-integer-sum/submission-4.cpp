class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int, int> mp;
        for(size_t i = 0; i < nums.size(); i++) {
            mp[nums[i]] = i;
        }
        for(size_t i = 0; i < nums.size(); i++) {
            if (mp.find(target - nums[i]) != mp.end() && i != mp[target - nums[i]]) {
                int small_index = i < mp[target - nums[i]] ? i:mp[target - nums[i]],
                large_index = small_index == i? mp[target - nums[i]]:i;
                return {small_index, large_index};
            }
        }
        return {-1};
    }
};
