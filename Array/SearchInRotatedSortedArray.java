public class SearchInRotatedSortedArray{
class Solution {
    public int search(int[] nums, int target) {
        int start = 0; int end = nums.length-1;

        if (nums.length ==0){         // edge case n=0
            return -1;
        }

        if(nums.length ==1){          // edge case n=1
            if(nums[0] == target){
                return 0;
            }else{
                return -1;
            }
        }

        if(nums.length ==2){         // edge case n=2
            if(nums[0] == target){
                return 0;
            }else if(nums[1] == target){
                return 1;
            }else{
                return -1;
            }
        }

        while(start<=end){
        
            int mid = start + (end-start)/2;

            if(target == nums[mid]){
                return mid;
            }

            if(nums[mid]>=nums[start]){         
                                                                   // left part of array is sorted
                if(target>=nums[start] && target<=nums[mid]){
                                                                   // target lie in  left sorted part
                    end = mid-1;
                }else{
                                                                    // target lie in right unsorted part
                    start = mid+1;
                }
            }else{
                                                                      // right part of array is sorted
                if(target>=nums[mid] && target<=nums[end]){
                                                                       // target lie in sorted right part
                    start = mid+1;
                }else{
                                                                      // target lie in unsorted left part
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
}
