package program;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) {
        new Application().run();
    }

    public void run() {
        SimpleUtils utils = new SimpleUtils();
        TimeUnit tus = TimeUnit.SECONDS;
        long temp1 = new Date().getTime();
        utils.threadSleep(1);
        long temp2 = new Date().getTime();
        long resposta = tus.convert(temp2 - temp1, TimeUnit.MILLISECONDS);
//      ------------------------------

        String timeFormated = utils.calcularDiferencaDeTempo(temp1, temp2);

        System.out.println("Time difference: " + resposta);
        System.out.println("");
        System.out.println("Tempo formatado: " + timeFormated);
    }
}
