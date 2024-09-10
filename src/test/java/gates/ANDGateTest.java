package gates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ANDGateTest {
    private final ANDGate andGate = new ANDGate();

    @Test
    public void processReturnsTrue() {
        Assertions.assertTrue(andGate.process(true, true));
    }

    @Test
    public void processReturnsFalse() {
        Assertions.assertFalse(andGate.process(false, true));
        Assertions.assertFalse(andGate.process(true, false));
        Assertions.assertFalse(andGate.process(false, false));
    }
}
