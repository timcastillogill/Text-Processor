import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessorTest {

    @Test
    void check_text_has_at_least_one_word() {
        assertEquals("This text has 1 word", Processor.analyse("The"));
    }


//    @Test
//    void output_1996() {
//        boolean expected = true;
//        boolean actual = leapYear.output(1996);
//        assertEquals(expected, actual);
//    }
}
