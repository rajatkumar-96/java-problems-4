import java.util.*;
public class occurence{
    public static void main(String[] args) {
        String new1="Java is java again java again";
       String new2= new1.replace("a","");
       int n=new1.length()-new2.length();
       System.out.println("Number of a's in the string:"+n);
    }
}