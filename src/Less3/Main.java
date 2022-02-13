package Less3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"фрукты", "яблоки", "груши", "ананас", "абрикос", "яблоки", "груши", "ананас", "абрикос", "кот", "собака", "птица" };
        System.out.println(Arrays.toString(arr));

        Map<String, Integer> hmap = new HashMap<>();
        for (String i: arr){
            hmap.put(i, hmap.getOrDefault(i,0) + 1);
        }
        System.out.println(hmap);

        PhoneBook phone = new PhoneBook();
        phone.add("Иванов", "+77870102039");
        phone.add("Смирнов", "+77809802039");
        phone.add("Сидоров", "+778701020789");
        phone.add("Леонов", "+77870103333");
        phone.add("Петросян", "+778701024444");
        phone.add("Смирнов", "+77870105555");
        phone.add("Иванов", "+77870106666");
        phone.add("Леонов", "+77870106784");

        System.out.println(phone.get("Иванов"));
        System.out.println(phone.get("Смирнов"));
        System.out.println(phone.get("Леонов"));
        System.out.println(phone.get("Петросян"));
        System.out.println(phone.get("Сидоров"));
    }
}