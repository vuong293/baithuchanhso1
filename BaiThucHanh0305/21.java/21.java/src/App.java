import java.util.ArrayList;
public class ArrList{
    public static void main(String[] args){
        ArrayList<String> clors = new ArryList<String>(3);
        clors.add ("Red");
        clors.add("Blue");
        clors.add("Green");
        clors.add("Orange");
        clors.remove("Green");
        clors.add("Pink");
        clors.add("Yellow");

        System.out.println(colors.get(1));
        System.out.println(colors.contains("Orange"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}