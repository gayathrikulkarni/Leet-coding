class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums3 = nums1+nums2
        nums3.sort()
        low = 0
        high = len(nums3)-1
        midL = (low+high)//2
        midH = ceil((low+high)/2)
        if len(nums3)/2 == 0:
            return float(nums3[midL])
        else:
            return float((nums3[midL]+nums3[midH])/2)
        