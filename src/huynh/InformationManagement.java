public class InformationManagement {
    public InformationManagement() {
        System.out.println();
    }

    myqueue vertqueueA = new myqueue(7);

    public boolean enQueueVertA(Object x) {
        return vertqueueA.enQueue(x);
    }

    public Object dequeueVertA() {
        return vertqueueA.deQueue();
    }

    public void TraverseQueueVertA() {
        vertqueueA.TraverseQueue();
    }

    public Object FrontA() {
        return vertqueueA.front();
    }

    public boolean growA() {
        return vertqueueA.grow();
    }

    // Vert B
    myqueue vertqueueB = new myqueue(7);

    public boolean enQueueVertB(Object x) {
        return vertqueueB.enQueue(x);
    }

    public Object dequeueVertB() {
        return vertqueueB.deQueue();
    }

    public void TraverseQueueVertB() {
        vertqueueB.TraverseQueue();
    }

    public Object FrontB() {
        return vertqueueB.front();
    }

    public boolean growB() {
        return vertqueueB.grow();
    }

    // Vert C
    myqueue vertqueueC = new myqueue(7);

    public boolean enQueueVertC(Object x) {
        return vertqueueC.enQueue(x);
    }

    public Object dequeueVertC() {
        return vertqueueC.deQueue();
    }

    public void TraverseQueueVertC() {
        vertqueueC.TraverseQueue();
    }

    public Object FrontC() {
        return vertqueueC.front();
    }

    public boolean growC() {
        return vertqueueC.grow();
    }

    // Vert D
    myqueue vertqueueD = new myqueue(7);

    public boolean enQueueVertD(Object x) {
        return vertqueueD.enQueue(x);
    }

    public Object dequeueVertD() {
        return vertqueueD.deQueue();
    }

    public void TraverseQueueVertD() {
        vertqueueD.TraverseQueue();
    }

    public Object FrontD() {
        return vertqueueD.front();
    }

    public boolean growD() {
        return vertqueueD.grow();
    }

    // Vert E
    myqueue vertqueueE = new myqueue(7);

    public boolean enQueueVertE(Object x) {
        return vertqueueE.enQueue(x);
    }

    public Object dequeueVertE() {
        return vertqueueE.deQueue();
    }

    public void TraverseQueueVertE() {
        vertqueueE.TraverseQueue();
    }

    public Object FrontE() {
        return vertqueueE.front();
    }

    public boolean growE() {
        return vertqueueE.grow();
    }

    // Stack store message Of each station
    mystack vertstack = new mystack(6);
    Object[] a = vertstack.a;

    public boolean pushVert(Object x) {
        return vertstack.push(x);
    }

    public Object popVert() {
        return vertstack.pop();
    }

    public void TraverseVert() {
        vertstack.Traverse();
    }

    public Boolean isEmpty() {
        return vertstack.isEmpty();
    }

    // Stack store all message of all stations
    mystack stackallStation = new mystack(15);
    Object[] aAll = stackallStation.a;

    public boolean pushVertSAT(Object x) {
        return stackallStation.push(x);
    }

    public Object popVertSAT() {
        return stackallStation.pop();
    }

    public void TraverseVertSAT() {
        stackallStation.Traverse();
    }

    public Boolean isEmptyALL() {
        return stackallStation.isEmpty();
    }

    // Stack store way of message
    mystack stackway = new mystack(3);
    Object[] w = stackway.a;

    public boolean pushVertw(Object x) {
        return stackway.push(x);
    }

    public Object popVertw() {
        return stackway.pop();
    }

    public void TraverseVertw() {
        stackway.Traverse();
    }

    public Boolean isEmptyw() {
        return stackway.isEmpty();
    }

    // Stack store all way of message
    mystack stackallway = new mystack(15);
    Object[] wAll = stackallway.a;

    public boolean pushVertwAll(Object x) {
        return stackallway.push(x);
    }

    public Object popVertwAll() {
        return stackallway.pop();
    }

    public void TraverseVertwAll() {
        stackallway.Traverse();
    }

    public Boolean isEmptywAll() {
        return stackallway.isEmpty();
    }

    // Stack store latency of message
    mystack stacklatency = new mystack(3);
    Object[] la = stacklatency.a;

    public boolean pushVertLatency(Object x) {
        return stacklatency.push(x);
    }

    public Object popVertLatency() {
        return stacklatency.pop();
    }

    public void TraverseVertLatency() {
        stacklatency.Traverse();
    }

    public Boolean isEmptyLatency() {
        return stacklatency.isEmpty();
    }

    // Stack store All latency of message
    mystack stacklatencyAll = new mystack(15);
    Object[] la_all = stacklatencyAll.a;

    public boolean pushVertLatencyAll(Object x) {
        return stacklatencyAll.push(x);
    }

    public Object popVertLatencyAll() {
        return stacklatencyAll.pop();
    }

    public void TraverseVertLatencyAll() {
        stacklatencyAll.Traverse();
    }

    public Boolean isEmptyLatencyAll() {
        return stacklatencyAll.isEmpty();
    }

    String Direction;
    int Ts;
    // Stack store station send message time
    mystack stackstation = new mystack(3);
    Object[] sta = stackstation.a;

    public boolean pushVertstation(Object x) {
        return stackstation.push(x);
    }

    public Object popVertstation() {
        return stackstation.pop();
    }

    public void TraverseVertstation() {
        stackstation.Traverse();
    }

    public Boolean isEmptystation() {
        return stackstation.isEmpty();
    }

    // Stack store All Station send message time
    mystack stackstationall = new mystack(15);
    Object[] sta_all = stackstationall.a;

    public boolean pushVertstationall(Object x) {
        return stackstationall.push(x);
    }

    public Object popVertstationall() {
        return stackstationall.pop();
    }

    public void TraverseVertstationall() {
        stackstationall.Traverse();
    }

    public Boolean isEmptystationall() {
        return stackstationall.isEmpty();
    }

    String Phoneall;
    // Stack store phone number of customer of each station
    mystack stackphonenum = new mystack(3);
    Object[] phonenum = stackphonenum.a;

    public boolean pushVertpNum(Object x) {
        return stackphonenum.push(x);
    }

    public Object popVertpNum() {
        return stackphonenum.pop();
    }

    public void TraverseVertpNum() {
        stackphonenum.Traverse();
    }

    public Boolean isEmptypNum() {
        return stackphonenum.isEmpty();
    }

    // Stack store all phone number of customer of each station
    mystack stackphonenumAll = new mystack(15);
    Object[] phonenumAll = stackphonenumAll.a;

    public boolean pushVertpNumAll(Object x) {
        return stackphonenumAll.push(x);
    }

    public Object popVertpNumAll() {
        return stackphonenumAll.pop();
    }

    public void TraverseVertpNumAll() {
        stackphonenumAll.Traverse();
    }

    public Boolean isEmptypNumAll() {
        return stackphonenumAll.isEmpty();
    }

    // Stack store phone number receive customer of each station
    String PhonenumReAll;
    mystack stackphonenumRe = new mystack(3);
    Object[] phonenumR = stackphonenumRe.a;

    public boolean pushVertpNumRe(Object x) {
        return stackphonenumRe.push(x);
    }

    public Object popVertpNumRe() {
        return stackphonenumRe.pop();
    }

    public void TraverseVertpNumRe() {
        stackphonenumRe.Traverse();
    }

    public Boolean isEmptypNumRe() {
        return stackphonenumRe.isEmpty();
    }

    // Stack store all phone number receiver customer of each station
    mystack stackphoneReAll = new mystack(15);
    Object[] phonenumRAll = stackphoneReAll.a;

    public boolean pushVertpNumReAll(Object x) {
        return stackphoneReAll.push(x);
    }

    public Object popVertpNumpNumReAll() {
        return stackphoneReAll.pop();
    }

    public void TraverseVertpNumReAll() {
        stackphoneReAll.Traverse();
    }

    public Boolean isEmptypNumReAll() {
        return stackphoneReAll.isEmpty();
    }
}