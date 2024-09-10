package counter;

import gates.NANDGate;

public class DLatch {
    private final NANDGate nandGate;
    private boolean q;
    private boolean notQ;

    public DLatch() {
        q = false;
        notQ = true;
        nandGate = new NANDGate();
    }

    public void setLatch(boolean enable, boolean data) {
        boolean a = nandGate.process(enable, data);
        boolean b = nandGate.process(enable, a);
        notQ = nandGate.process(q, b);
        q = nandGate.process(a, notQ);
    }

    public boolean getQ() {
        return q;
    }
}
