from typing import List

def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
    while k > 0:
        current_min = min(nums)
        index = nums.index(current_min)
        nums[index] *= multiplier
        k -= 1
    return nums
