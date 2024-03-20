class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        hash_set = {} # make a hash set
        n = len(nums)
        for i in range(n): # iterate through the length of nums
            remainder = target - nums[i] # the difference of target minus cur
            if remainder in hash_set: # if its in the set
                return [hash_set[remainder], i] # return index of remainder, cur
            hash_set[nums[i]] = i # add the index into the hash set

        return [] # no solution found