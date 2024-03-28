# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
check every character in the array and if its not a number add it to the stack, otherwise append the evaluation character of the last 2 integers.

# Approach
<!-- Describe your approach to solving the problem. -->
- make a stack
- iterate through every character in the array
- since there are only 4 operaters, check if the current character equals that operator
- append the evaluation of the last 2 integers that were popped from the stack

# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution(object):
    def evalRPN(self, tokens):
        stack = []
        for c in tokens:
            if c == "+":
                stack.append(stack.pop() + stack.pop())
            elif c == "-":
                a, b = stack.pop(), stack.pop()
                stack.append(b - a)
            elif c == "*":
                stack.append(stack.pop() * stack.pop())
            elif c == "/":
                a, b = stack.pop(), stack.pop()
                stack.append(int(float(b) / a))
            else:
                stack.append(int(c))
        return stack[0]
```