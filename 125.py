# 1. In place comparison: s[i] == s[n - 1 -i]
# 2. Reverse and compare
# 3. Stack, Queue => Compare every element in stack and queue

class Solution(object):
  def isPalindrome(self, s):
    if not s: return True

    new_string = []
    for i in s:
      if i.isdigit(): new_string.append(i)
      elif i.isalpha(): new_string.append(i.lower())
    return new_string[::-1] == new_string
