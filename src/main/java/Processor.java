public class Processor {
    public static String analyse(String sentence) {
        String[] words = sentence.split(" ");

        return "This text has " + words.length + " word";
    }
}
