public class mystack {
    int max, top;
    Object[] a;

    public mystack(int max) {
        this.max = max;
        this.a = new Object[max];
        top = -1;
    }

    public mystack() {
        this.max = 50;
        this.top = -1;
        this.a = new Object[max];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == max - 1;
    }

    public Object top() {
        Object kq = null;
        if (!isEmpty()) {
            kq = a[top];
        }
        return kq;
    }

    public boolean push(Object x) {
        boolean state = false;
        if (!isFull()) {
            a[++top] = x;
            state = true;
        }
        return state;
    }

    public void Traverse() {
        if (!isEmpty()) {
            for (Object m : this.a) {
                System.out.print(m + "\t");
            }
        } else {
            System.out.println("Stack empty");

        }
    }

    public Object pop() {
        Object kq = null;
        if (!isEmpty()) {
            kq = a[top--];
        }
        return kq;
    }
}
