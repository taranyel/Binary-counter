package counter;

public class BinaryCounter1Bit {
    private final FlipFlop flipFlop;

    public BinaryCounter1Bit() {
        flipFlop = new FlipFlop();
    }

    public boolean getFlipFlopOutput(boolean clock) {
        boolean data = !flipFlop.getOutput();
        flipFlop.setFlipFlop(clock, data);
        return flipFlop.getOutput();
    }
}
