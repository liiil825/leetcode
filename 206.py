# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        return self._reverse(head)

    def _reverse(self, head, newHead = None):
        if not head: return newHead

        node = head.next
        head.next = newHead

        return self._reverse(node, head)
