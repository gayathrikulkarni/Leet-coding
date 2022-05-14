class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low = 0
        high = len(nums)-1
        while low <= high:
            mid = (low+high)//2
            midNumber = nums[mid]
            if midNumber == target:
                return mid
            if midNumber >= nums[low]:
                if nums[low] <= target <= midNumber:
                    high = mid -1
                else:
                    low = mid +1
            elif midNumber <= nums[high]:
                if midNumber <= target <= nums[high]:
                    low = mid +1
                else:
                    high = mid -1      
        return -1
        