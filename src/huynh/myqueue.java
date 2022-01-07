public class myqueue {
    protected int max;
    protected Object[] a;
    protected int first, last;

    public myqueue(int max) {
        this.max = max;
        this.a = new Object[max];
        first = last = -1;
    }

    public myqueue() {
        this.max = 10;
        this.a = new Object[max];
        first = last = -1;
    }

    public boolean isEmpty() {
        return (this.first == -1);
    }

    public boolean isFull() {
        return ((first == 0 && last == max - 1) || first == last + 1);
    }

    public boolean grow() {
        int i, j;
        int max1 = max + max / 2;
        Object[] a1 = new Object[max];
        if (first <= last) {
            for (i = first; i <= last; i++) {
                a1[i - first] = a[i];
            }
        } else {
            for (i = first; i < max; i++) {
                a1[i - first] = a[i];
            }
            for (j = 0; j <= last; j++) {
                a1[j + max - first] = a[j];
            }
        }
        a = a1;
        max = max1;
        // Calculating current size and set new first, last
        int size;
        if (first <= last) {
            size = last - first + 1;
        } else {
            size = max - first + last;
        }
        first = 0;
        last = size - 1;
        return true;
    }

    public boolean enQueue(Object x) {
        boolean state = false;
        if (!isFull()) {
            this.a[(++last) % max] = x;
            state = true;
            if (first == -1)
                first = 0;
        }
        return state;
    }

    public Object deQueue() {
        Object x = null;
        if (!isEmpty()) {
            x = this.a[first % max];
            first++;
            if (first > last)
                first = last = -1;
        }
        return x;
    }


    public void TraverseQueue() {
        if (!isEmpty()) {
            for (Object ql : a) {
                System.out.print(ql + "\t");
            }
        } else {
            System.out.println("Queue empty");

        }
    }

    public Object front() {
        return a[first];
    }
}
