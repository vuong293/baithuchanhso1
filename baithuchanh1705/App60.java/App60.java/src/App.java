import java.util.LinkedHashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C#");
        linkedHashSet.add("PHP");
        linkedHashSet.add("Python");
        for (String str : linkedHashSet) {
            System.out.println(str);
        }
    }
}