package gates;

public class NORGate implements Gate {
    private final NANDGate nandGate = new NANDGate();

    @Override
    public boolean process(boolean a, boolean b) {
        boolean c = nandGate.process(nandGate.process(a, a), nandGate.process(b, b));
        return nandGate.process(c, c);
    }
}
