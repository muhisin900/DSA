class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # returning the elements that appear more than k times
        hash_set = {}
        result = []
        for i in nums:
            if i in hash_set:
                hash_set[i] += 1
            else: 
                hash_set[i] = 1
                # both = 1, return the 2nd most frequent element
        sorted_list = sorted(hash_set.items(), key=lambda item: item[1], reverse=True)
        for i in range(k):
            result.append(sorted_list[i][0])


        return result