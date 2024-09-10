package gates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NORGateTest {
    private final NORGate norGate = new NORGate();

    @Test
    public void processReturnsTrue() {
        Assertions.assertTrue(norGate.process(false, false));
    }

    @Test
    public void processReturnsFalse() {
        Assertions.assertFalse(norGate.process(true, true));
        Assertions.assertFalse(norGate.process(false, true));
        Assertions.assertFalse(norGate.process(true, false));
    }
}
