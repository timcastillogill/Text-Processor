import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class ProcessorTest {

    @Test
    @DisplayName("Checks sentence of one word not pluralised")
    void check_text_has_at_least_one_word() {
        String oneWord = "The";

        String result = Processor.analyse(oneWord);

        assertThat(result, CoreMatchers.containsString("1 word"));
    }
    @Test
    @DisplayName("Checks sentence of two words")
    void check_text_has_at_least_two_words() {
        String twoWords = "The next";

        String result = Processor.analyse(twoWords);

        assertThat(result, CoreMatchers.containsString("This text has 2 words"));

    }

    @Test
    @DisplayName("Checks full sentence of words")
    void check_text_whole_sentence() {
        String wholeSentence = "Hello, World! This checks the word count.";

        String result = Processor.analyse(wholeSentence);

        assertThat(result, CoreMatchers.containsString("This text has 7 words"));
    }

    @Test
    @DisplayName("Checks that the return statement includes a numbered list")
    void check_return_statement_has_number() {
        String oneWord = "hello";

        String result = Processor.analyse(oneWord);
        assertThat(result, CoreMatchers.containsString("1. hello"));
    }

    @Test
    @DisplayName("Does not list repeated words")
    void only_matched_words_listed() {
        String sameWordTwice = "hello hello";

        String result = Processor.analyse(sameWordTwice);
        assertThat(result, not(CoreMatchers.containsString("2. hello")));
    }
}
