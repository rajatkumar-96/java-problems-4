import java.util.*;
public class alphabetical{
    public static void main(String[] args) {
        String new1="there is nothing in this box. kindly get out of here.";
        String new3=new1.replace(".","");
        String[] new2=new3.split(" ");
        Arrays.sort(new2);
        for(String str:new2){
            System.out.print(str+" ");
        }
    }
}