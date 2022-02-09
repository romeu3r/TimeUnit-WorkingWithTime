package program;

import java.util.concurrent.TimeUnit;

public class SimpleUtils {
    public void threadSleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (Exception e) {
            // Unnecessary
        }
    }

    public String calcularDiferencaDeTempo(long inicio, long tempFim) {
        try {
            long tempo = tempFim - inicio;
            TimeUnit horas = TimeUnit.HOURS;
            TimeUnit minutos = TimeUnit.MINUTES;
            TimeUnit segundos = TimeUnit.SECONDS;
            TimeUnit ms = TimeUnit.MILLISECONDS;
            String sHora = formatData(String.valueOf(horas.convert(tempo, ms) % 60));
            String sMin = formatData(String.valueOf(minutos.convert(tempo, ms) % 60));
            String sSeg = formatData(String.valueOf(segundos.convert(tempo, ms) % 60));
            return sHora + ":" + sMin + ":" + sSeg;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String formatData(String tempo) {
        if (tempo.length() == 1)
            return "0" + tempo;
        else return tempo;
    }
}
