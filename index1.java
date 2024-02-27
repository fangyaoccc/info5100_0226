import java.util.ArrayList;
import java.util.List;

public class index1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Fred");
        names.add("Bobby");
        names.add("Joe");
        names.add("David");
        names.add("Eric");
        List<String> namesSwitched = new ArrayList<>();
        for (String name : names) {
            namesSwitched.add(switchLetters(name));
        }
        System.out.println("Names = { " + String.join(", ", names) + " }");
        System.out.println("Names (switched) = { " + String.join(", ", namesSwitched) + " }");
    }
        private static String switchLetters(String name) {
        if (name.length() <= 1) return name;
        char firstLetter = Character.toUpperCase(name.charAt(name.length() - 1));
        char lastLetter = Character.toLowerCase(name.charAt(0));
        String middle = name.substring(1, name.length() - 1).toLowerCase();
        return firstLetter + middle + lastLetter;
    }
}
