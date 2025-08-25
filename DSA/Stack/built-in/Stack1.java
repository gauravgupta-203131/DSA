public class Stack1 {
    Node top;

    void push(int element) {
        Node n1 = new Node(element);
        if (top == null) {
            top = n1;
            return;
        }
        n1.prev = top;
        top = n1;
        return;
    }

    int pop() {
        if (top == null) {
            return -1;
        }
        Node del = top;
        top = del.prev;
        return del.element;
    }

    int peek() {
        if (top == null) {
            return -1;
        }
        return top.element;
    }

    boolean isEmpty() {
        if (top == null)
            return false;
        return true;
    }

}
