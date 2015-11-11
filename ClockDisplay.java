
/**
 * Se crea un reloj al que se le introduce la hora y los segundos.
 * Se le podra invocar un metodo para cambiar las horas y los segundos.
 * @author David Encina Maestro 
 * @version 1.0
 */
public class ClockDisplay
{
    //La hora del reloj.
    private int horas;
    //Los segundos del reloj.
    private int minutos;     

    /**
     * Crea un reloj.
     */
    public ClockDisplay()
    {
        horas = 0;
        minutos = 0;        
    }

    /**
     * Se introducen horas y segundos para cambiar la hora del reloj.
     */
    public void setTime(int h, int m)
    {
        if (h <= 23 & h >= 0 & m <= 59 & m >= 0) {
            horas = h;
            minutos = m;
        }
        else {
            System.out.println ("Las horas han de estar entre el 0 y el 23 y los minutos entre 0 y 59");
        }
    }
    
    /**
     * Permite avanzar el tiempo 1 minuto.
     */
    public void timeTick()
    {
        horas = horas;        
        minutos = minutos + 1;
        if (minutos == 60) {
            horas = horas + 1;
            minutos = 0;
        }
        if (horas == 24) {
            horas = 0;
        }
    }
}
