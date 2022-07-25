public class Processor {
    public static String analyse(String sentence) {
        String[] words = sentence.split(" ");
        String pluralise = words.length == 1 ? " word" : " words";

        return "This text has " + words.length + pluralise;
    }
}
