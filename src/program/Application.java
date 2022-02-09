package program;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Application {
    SimpleUtils utils = new SimpleUtils();

    public static void main(String[] args) {
        new Application().run();
    }

    public void run() {
        TimeUnit tus = TimeUnit.SECONDS;
        long temp1 = new Date().getTime();
        utils.threadSleep(1);
        long temp2 = new Date().getTime();
        long resposta = tus.convert(temp2 - temp1, TimeUnit.MILLISECONDS);
        System.out.println("Time difference: " + resposta);
    }
}
