import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class ProcessorTest {

    @Test
    @DisplayName("Checks sentence of one word not pluralised")
    void check_text_has_at_least_one_word() {
        String oneWord = "The";

        String result = Processor.analyse(oneWord);

        assertEquals("This text has 1 word", result);
    }
    @Test
    @DisplayName("Checks sentence of two words")
    void check_text_has_at_least_two_words() {
        String twoWords = "The next";

        String result = Processor.analyse(twoWords);

        assertEquals("This text has 2 words", result);
    }

    @Test
    @DisplayName("Checks full sentence of words")
    void check_text_whole_sentence() {
        String wholeSentence = "Hello, World! This checks the word count.";

        String result = Processor.analyse(wholeSentence);

        assertEquals("This text has 7 words", result);
    }

    @Test
    @DisplayName("Checks that the return statement includes a numbered list")
    void check_return_statement_has_number() {
        String oneWord = "hello";

        String result = Processor.analyse(oneWord);
        assertThat(result, CoreMatchers.containsString("1. hello"));
    }
}
