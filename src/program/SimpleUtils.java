package program;

public class SimpleUtils {
    public void threadSleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (Exception e) {
            // Unnecessary
        }
    }
}
