package gates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XORGateTest {
    private final XORGate xorGate = new XORGate();

    @Test
    public void processReturnsTrue() {
        Assertions.assertTrue(xorGate.process(false, true));
        Assertions.assertTrue(xorGate.process(true, false));
    }

    @Test
    public void processReturnsFalse() {
        Assertions.assertFalse(xorGate.process(false, false));
        Assertions.assertFalse(xorGate.process(true, true));
    }
}
