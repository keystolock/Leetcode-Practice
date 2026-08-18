class Solution {
public:
    int largestInteger(vector<int>& nums, int k) {
        int n = nums.size();
    
        unordered_map <int,int> mpp;
        
        int mmax = nums[0];
        
        for(int i=0; i<n; i++){
            mmax = max(nums[i], mmax);
            
            if(mpp.find(nums[i]) == mpp.end()){
                mpp[nums[i]] = 1;
            } else {
            
                mpp[nums[i]]++;
            }
        }
        
        
        if(n == k) return mmax;
        
        else if(k == 1){
            int muniq = -1; 
            
            for(auto it : mpp){
                if(it.second == 1){
                    muniq = max(muniq, it.first);
                }
            }
            return muniq;
        }
        
        else if(mpp[nums[0]] == 1 && mpp[nums[n-1]] == 1) return max(nums[0], nums[n-1]);
        
        else if(mpp[nums[0]] == 1) return nums[0];
        
        else if(mpp[nums[n-1]] == 1) return nums[n-1];
        
        else{
            return -1;
        }
    }
};