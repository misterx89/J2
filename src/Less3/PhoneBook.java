package Less3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map <String, Set<String>> phoneBook = new HashMap<>();

    public void add(String name, String telNumber) {
        Set <String> tel = phoneBook.getOrDefault(name, new HashSet<>());
        tel.add(telNumber);
        phoneBook.put(name,tel);
    }
    public Set <String> get(String name) {
        return  phoneBook.get(name);
    }
}
