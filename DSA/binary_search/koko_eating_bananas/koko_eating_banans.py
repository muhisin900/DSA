class Solution(object):
    def minEatingSpeed(self, piles, h):

        low, high = 1, max(piles)
        res = high

        while (low <= high):

            mid = (low + high) // 2
            hours = 0

            for p in piles:
                hours += math.ceil(float(p) / mid)
            if hours <= h:
                res = mid
                high = mid - 1
            else:
                low = mid + 1
        return res

    
        