
/**
 * Se crea un reloj al que se le introduce la hora y los segundos.
 * Se le podra invocar un metodo para cambiar las horas y los segundos.
 * @author David Encina Maestro 
 * @version 1.0
 */
public class ClockDisplay
{
    //La hora del reloj.
    private int hor;
    //Los segundos del reloj.
    private int seg;
    

    /**
     * Crea un reloj.
     */
    public ClockDisplay(int hora, int segundo)
    {
        hor = hora;
        seg = segundo;
    }

    /**
     * Se introducen horas y segundos para cambiar la hora del reloj.
     */
    public void setTime(int horas, int segundos)
    {
        hor = horas;
        seg = segundos;
    }
}
