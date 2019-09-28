import java.util.*;
public class regexExample{
    public static void main(String[] args) {
        String str1= "This is harry";
        boolean b= str1.matches("(.*)Harry(.*)");
        System.out.println("Does the string contain Harry?  "+b);

    }
}