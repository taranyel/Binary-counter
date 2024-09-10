package gates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ORGateTest {
    private final ORGate orGate = new ORGate();

    @Test
    public void processReturnsTrue() {
        Assertions.assertTrue(orGate.process(false, true));
        Assertions.assertTrue(orGate.process(true, true));
        Assertions.assertTrue(orGate.process(true, true));

    }

    @Test
    public void processReturnsFalse() {
        Assertions.assertFalse(orGate.process(false, false));
    }
}
