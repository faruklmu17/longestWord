package WordPackage;
import org.testng.annotations.Test;
// this class is used to store the sentence and call the reusable methods to perform split and length of the longest word from the sentence
@Test
// reusable class is extended in this class
public class SDET_Word extends Reusable_Class {
        // the sentence is denoted here and split method is called
        String[] resultSplit = Reusable_Class.SplitString("The cow jumped over the moon");
        // an empty string is made to save the longest word
        String maxLengthWorld = " ";
        // split method's result and the empty string is passed in the reusable method called longestWord
        String result1 = Reusable_Class.LongestWord(resultSplit, maxLengthWorld);
        // longest word is printed here
        Object printWord = Reusable_Class.print("The longest word in the sentence: " + result1);
        // length of the longest word is printed here
        Object printLength = Reusable_Class.print("The length of the longest word: " + result1.length());

    }

