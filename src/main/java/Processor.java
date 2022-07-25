public class Processor {
    public static String analyse(String sentence) {
        String[] words = sentence.split(" ");
        int arrayLength = words.length;

        return wordList(words) + "This text has " + arrayLength + pluralise(arrayLength);
    }

    private static String pluralise(int arrayLength) {
        return arrayLength == 1 ? " word" : " words";
    }

    private  static String wordList(String[] words) {
        String list = "";
        for (int i = 0; i < words.length; i++) {
            list += (i + 1) + ". " + words[i];
        }
        return list;
    }
}
