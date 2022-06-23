class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {firstOcc(nums,target), lastOccr(nums,target)};
    }
    
    public int firstOcc(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                if(mid-1>=0 && nums[mid-1]==target)
                    end = mid-1;
                else
                    return mid;
            }
            else if(target > nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
        
    public int lastOccr(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == nums[mid]){
                if(mid+1<nums.length && nums[mid+1]==target)
                    start = mid+1;
                else
                    return mid;
            }
            else if(target > nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
