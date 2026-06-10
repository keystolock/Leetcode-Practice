public class TrapRainWater {
    class Solution {
    public int trap(int[] height) {
        if(height.length ==0 || height.length ==1 || height.length ==2){               //edge case
            return 0;
        }

        int left = 0; int right = height.length-1;
        int maxLeft = height[0]; int maxRight = height[height.length-1];
        int waterLevel =0;
        
        while(left<=right){

            if(height[left]<=height[right]){                          // water level depends on left

                 if(height[left]>maxLeft){
                    maxLeft = height[left];
                 }else{
                    waterLevel += maxLeft - height[left];
                 }                                
                 
                left++;

            }else{
                                                
                 if(height[right]>maxRight){                   // water level depends on right
                    maxRight = height[right];
                 }else{
                    waterLevel += maxRight-height[right];
                 }                                  
            
                  right--;                                             
            }
        }
        return waterLevel;
    }
}
}
