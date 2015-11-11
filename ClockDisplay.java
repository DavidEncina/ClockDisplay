
/**
 * Se crea un reloj que marca la hora y los segundos.
 * Se podra invocar un metodo para cambiar las horas y los segundos.
 * Se podra invocar un metodo para aumentar los minutos en 1.
 * Se podra invocar un metodo para que decuelva la hora siempre en el mismo formato.
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
     * Cuando se pase de 59 minutos los minutos volveran a 0 y las horas sumaran 1.
     * Cuando las horas lleguen a 24 volveran automaticamente a 0.
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
    
    /**
     * Metodo para devuelver la hora y los minutos separados por dos puntos.
     * El formato consta siempre de 5 caracteres.
     */
    public String getTime()
    {
        String time = horas +":" + minutos;
        if (horas < 10) {
            time = "0" + horas +":" + minutos;
        }
        if (minutos < 10) {
            time = horas +":" + "0" + minutos;
        }
        if (horas < 10 & minutos < 10) {
            time = "0" + horas +":" + "0" + minutos;
        }
        return time;    
    }
}
