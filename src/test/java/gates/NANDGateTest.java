package gates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NANDGateTest {

    private final NANDGate nandGate = new NANDGate();

    @Test
    public void processReturnsFalse() {
        Assertions.assertFalse(nandGate.process(true, true));
    }

    @Test
    public void processReturnsTrue() {
        Assertions.assertTrue(nandGate.process(false, false));
        Assertions.assertTrue(nandGate.process(true, false));
        Assertions.assertTrue(nandGate.process(false, true));
    }
}
