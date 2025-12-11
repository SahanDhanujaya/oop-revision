package stringBuffer;

public class BufferVsBuilderTest {
    public static void main(String[] args) {

        // ----- Using StringBuffer -----
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.currentTimeMillis();

        for (int i = 1; i <= 1_000_000; i++) {
            stringBuffer.append(i);
        }

        long endBuffer = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endBuffer - startBuffer) + " ms");

        // ----- Using StringBuilder -----
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.currentTimeMillis();

        for (int i = 1; i <= 1_000_000; i++) {
            stringBuilder.append(i);
        }

        long endBuilder = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endBuilder - startBuilder) + " ms");

        // ----- Observations -----
        System.out.println("\nObservation:");
        System.out.println("StringBuilder is faster because it is not synchronized (not thread-safe).");
        System.out.println("StringBuffer is slower because it is synchronized (thread-safe).");
    }
}
