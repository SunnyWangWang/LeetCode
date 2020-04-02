"""
Description: Given an array of integers and an integer K, return the max S in array where A[i] + A[j] = S and S < K;
if no such A[i] + A[j] found, return -1.

IDEA: I use two for loops to compute the combination of each 2 integers and record them in an additional list if the
A[i] + A[j] < K; Then finally return the max in the result list.
"""


class Solution:
    def twoSumLessThanK(self, A: List[int], K: int) -> int:
        res = []
        for i in range(len(A)):
            for j in range(i + 1, len(A)):
                S = A[i] + A[j]
                if S < K:
                    res.append(S)

        if res != []:
            return max(res)
        else:
            return -1
