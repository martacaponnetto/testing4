import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console -Crea dei test per questo esercizio*/
public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int dataAnno = ottieneDataAnno(dateTime);
        System.out.println("anno : " + dataAnno);
        int dataMese = ottieniMeseData(dateTime);
        System.out.println("mese : " + dataMese);
        int dataGiorno = ( ottieniDatagiorno(dateTime));
        System.out.println("giorno : " + dataGiorno);

        String dataGiornoSettimana = giornoDellaSettimana(dateTime);
        System.out.println("giorno della settimana : " + dataGiornoSettimana);




    }
    public static int ottieneDataAnno(OffsetDateTime dateTime) {
        LocalDateTime localDateTime = dateTime.toLocalDateTime(); //converto l'OffsetDateTime in un LocalDateTime che mi ritorna l'anno
        return localDateTime.getYear();

    }
    public static int ottieniMeseData(OffsetDateTime dateTime){
        LocalDateTime localDateTime = dateTime.toLocalDateTime();
        return localDateTime.getMonthValue();

    }
    public static int ottieniDatagiorno(OffsetDateTime dateTime){
        LocalDateTime localDateTime = dateTime.toLocalDateTime();
        return localDateTime.getDayOfMonth();
    }
    public static String giornoDellaSettimana(OffsetDateTime dateTime){
        LocalDateTime localDateTime = dateTime.toLocalDateTime();
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        return String.valueOf(dayOfWeek);

    }

}