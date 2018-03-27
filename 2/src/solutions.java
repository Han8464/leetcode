
public class solutions {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        int a[] = {2, 4, 3};
        int b[] = {5, 6, 4};

        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(3);

        a1.next = a2;
        a2.next = a3;
        a3.next = null;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;
        b3.next = null;

        addTwoNumbers2(new ListNode(0), new ListNode(0));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode cur1, cur2;

        cur1 = l1;
        cur2 = l2;
        boolean overflow = false;
        while(cur1 != null && (cur2 != null || overflow)) {
            int sum = cur1.val + (cur2 == null?0:cur2.val) + (overflow?1:0);
            if (sum >= 10) {
                overflow = true;
                cur1.val = sum - 10;
            } else {
                overflow = false;
                cur1.val = sum;
            }

            cur2 = cur2 == null ? null : cur2.next;
            if (cur1.next == null) {
                if (cur2 != null || overflow) {
                    ListNode tmp = new ListNode(0);
                    tmp.next = null;
                    cur1.next = tmp;
                    cur1 = tmp;
                }
            } else {
                cur1 = cur1.next;
            }
        }

        return l1;
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int a = 0, b = 0;
        int na = 1, nb = 1;
        while (l1 != null) {
            a += l1.val * na;
            na *= 10;
            l1 = l1.next;
        }
        while (l2 != null) {
            b += l2.val * nb;
            nb *= 10;
            l2 = l2.next;
        }
        int sum = a + b;
        ListNode head = null;
        if (sum == 0)
        {
            head = new ListNode(0);
            head.next = null;
            return head;
        }
        ListNode cur;
        while (sum != 0)
        {
            int tmp = sum % 10;
            sum = sum / 10;
            cur = new ListNode(tmp);
            cur.next = null;
            if (head == null) {
                head = cur;
            }else
            {
                ListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = cur;
            }


        }
        return head;
    }
}

