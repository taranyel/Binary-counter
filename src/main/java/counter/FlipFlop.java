package counter;

public class FlipFlop {
    private final DLatch masterLatch;
    private final DLatch slaveLatch;

    public FlipFlop() {
        masterLatch = new DLatch();
        slaveLatch = new DLatch();
    }

    public void setFlipFlop(boolean clock, boolean data) {
        masterLatch.setLatch(clock, data);
        slaveLatch.setLatch(!clock, masterLatch.getQ());
    }

    public boolean getOutput() {
        return slaveLatch.getQ();
    }
}
