import java.util.*;
public class mirror{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any Sentence: ");
    String sentence = input.nextLine();
    String[] stringArray = sentence.split(" ");
    for(int i = 0; i<stringArray.length; i++){
        String temp = new StringBuilder(stringArray[i]).reverse().toString();
        System.out.print(temp+" ");
    }
    }
}