package gates;

public class XORGate implements Gate{
    private final NANDGate nandGate = new NANDGate();
    @Override
    public boolean process(boolean a, boolean b) {
        boolean c = nandGate.process(a, b);
        return nandGate.process(nandGate.process(a, c), nandGate.process(c , b));
    }
}
