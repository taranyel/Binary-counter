package gates;

public class NANDGate implements Gate {

    @Override
    public boolean process(boolean a, boolean b) {
        return !(a && b);
    }
}
