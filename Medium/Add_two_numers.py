# Question Body: https://leetcode.com/problems/add-two-numbers/

# You are given two non-empty linked lists representing two non-negative integers.
# The digits are stored in reverse order, and each of their nodes contains a single
# digit. Add the two numbers and return the sum as a linked list.


# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __str__(self):
        tar = self
        out = "Number: "
        while tar:
            out += str(tar.val)
            print(tar.val)
            tar = tar.next
        return out


def addTwoNumbers(l1: ListNode, l2: ListNode):
    head = ListNode()
    res = head
    flag1 = True
    flag2 = True
    remainder = 0

    while flag1 or flag2 or remainder:

        num1 = l1.val if flag1 else 0
        num2 = l2.val if flag2 else 0
        res.val = (num1 + num2 + remainder) % 10
        remainder = (num1 + num2 + remainder) // 10

        if l1.next:
            l1 = l1.next
        else:
            flag1 = False

        if l2.next:
            l2 = l2.next
        else:
            flag2 = False

        if flag1 or flag2 or remainder:
            res.next = ListNode()
            res = res.next

    return head


# Testing the code
if __name__ == "__main__":
    l1 = ListNode(1, ListNode(3, ListNode(5, ListNode(6))))
    l2 = ListNode(3, ListNode(8, ListNode(9, ListNode(3))))

    print(addTwoNumbers(l1, l2))
