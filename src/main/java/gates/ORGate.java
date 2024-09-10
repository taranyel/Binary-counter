package gates;

public class ORGate implements Gate {
    private final NANDGate nandGate = new NANDGate();

    @Override
    public boolean process(boolean a, boolean b) {
        boolean x = nandGate.process(a, a);
        boolean y = nandGate.process(b, b);
        return nandGate.process(x, y);
    }
}
