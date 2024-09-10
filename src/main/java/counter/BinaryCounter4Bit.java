package counter;

public class BinaryCounter4Bit {

    public static int BITS = 4;
    private final BinaryCounter1Bit[] binaryCounter4Bit;

    public BinaryCounter4Bit() {
        binaryCounter4Bit = new BinaryCounter1Bit[BITS - 1];
        for (int i = 0; i < BITS - 1; i++) {
            binaryCounter4Bit[i] = new BinaryCounter1Bit();
        }
    }

    private void count() {
        boolean clock = true;
        for (int i = 0; i < Math.pow(2, BITS); i++) {

            boolean lastClock = !clock;
            StringBuilder bits = new StringBuilder();

            for (int j = 0; j < BITS - 1; j++) {

                if (j == 0) {
                    bits.append(clock ? 0 : 1);
                }

                boolean output = binaryCounter4Bit[j].getFlipFlopOutput(lastClock);
                lastClock = output;
                bits.append(output ? 1 : 0);
            }
            clock = !clock;
            bits.reverse();
            int num = Integer.parseInt(bits.toString(), 2);
            System.out.printf("%s - %d\n", bits, num);
        }
    }

    public static void main(String[] args) {
        BinaryCounter4Bit binaryCounter4Bit1 = new BinaryCounter4Bit();
        binaryCounter4Bit1.count();
    }
}
