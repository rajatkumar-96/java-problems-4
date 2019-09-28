import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class patternmatcher{
    public static void main(String[] args) {
        String str1="she sells seashells by the seashore";
        String patternString="se";
        Pattern pattern=Pattern.compile(patternString);
        Matcher matcher=pattern.matcher(str1);
        int count=0;
        while(matcher.find()){
            count++;
            System.out.println("Found at: "+ matcher.start()+"-"+matcher.end());
        }
    }
}