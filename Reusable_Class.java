package WordPackage;

// all the reusable methods are defined here
public class Reusable_Class {
    // this reusable class is used to split the given sentence
    public static String[] SplitString(String s) {
        String[] word = s.split(" ");
        return word;
    }

    // this reusable method is used to find the longest word from the sentence
    public static String LongestWord(String[] sentence, String newWord) {
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].length() >= newWord.length()) {
                newWord = sentence[i];
            }
        }
        return newWord;
    }

    //this reusable method is used to print the longest word and it's length
    public static Object print(Object newObject) {
        System.out.println(newObject);
        return newObject;
    }
}
