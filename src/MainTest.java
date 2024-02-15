import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void ottieneDataAnno() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int expectedAnno = 2023;
        assertEquals(expectedAnno, Main.ottieneDataAnno(dateTime));


    }

    @org.junit.jupiter.api.Test
    void ottieniMeseData() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int expectedMese = 3;
        assertEquals(expectedMese, Main.ottieniMeseData(dateTime));

    }

    @org.junit.jupiter.api.Test
    void ottieniDatagiorno() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int expectedGiorno = 1;
        assertEquals(expectedGiorno, Main.ottieniDatagiorno(dateTime));
    }

    @org.junit.jupiter.api.Test
    void giornoDellaSettimana() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String expectedGiornoSettimana = "WEDNESDAY";
        assertEquals(expectedGiornoSettimana, Main.giornoDellaSettimana(dateTime));
    }
}