import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(280,89 );
    }

    @Test
    public void canGetPaperLeft(){
        assertEquals(280, printer.getPaperLeft());
    }

    @Test
    public void canPrintPaper(){
        printer.printPaper(4,12);
        assertEquals(232, printer.getPaperLeft());
    }

    @Test
    public void canMeasureToner(){
        printer.printPaper(2, 8);
        assertEquals(73, printer.measureToner());
    }
}
