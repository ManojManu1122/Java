import java.util.*;
class Main{
    public static void main(String[] args){
        int[] nums = {101,1,5,3,1,1,102,103,3,3,3,100,2,4};
        System.out.print(longestSequence(nums));
    }
    
    static int longestSequence(int[] nums){
        Arrays.sort(nums);
        
        int last_smaller = nums[0];
        int cnt = 1;
        int longest = 1;
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]-1==last_smaller){
                cnt++;
                last_smaller = nums[i];
            }
            else if(nums[i]!=last_smaller){
                cnt = 1;
                last_smaller = nums[i];
            }
            longest = Math.max(longest,cnt);
            
        }
        return longest;
    }
        
    }