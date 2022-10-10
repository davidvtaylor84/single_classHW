import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(12, 18);
    }

    @Test
    public void canGetPaperLeft(){
        assertEquals(12, printer.getPaperLeft());
    }

    @Test
    public void canPrintPaper(){
        printer.printPaper();
        assertEquals(6, printer.getPaperLeft());
    }
}
