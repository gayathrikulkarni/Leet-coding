class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        def firstOccurence(nums, target):
            lo = 0
            hi = len(nums)-1
            while lo <= hi:
                i = (lo+hi)//2
                if nums[i] == target:
                    # find first occurence
                    if i-1 >= 0 and nums[i-1] == target:
                        hi = i - 1
                    else:
                        return i
                elif nums[i] > target:
                    hi = i-1
                elif nums[i] < target:
                    lo = i+1
            return -1


        def lastOccurence(nums, target):
            lo = 0
            hi = len(nums)-1
            while lo <= hi:
                i = (lo+hi)//2
                if nums[i] == target:
                    # find last occurence
                    if i+1 <= hi and nums[i+1] == target:
                        lo = i + 1
                    else:
                        return i
                elif nums[i] > target:
                    hi = i-1
                elif nums[i] < target:
                    lo = i+1
            return -1

        return [firstOccurence(nums, target), lastOccurence(nums, target)]    
        