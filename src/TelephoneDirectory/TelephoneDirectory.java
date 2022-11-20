package TelephoneDirectory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TelephoneDirectory {
    private final Map<PersonName, String> telephoneDirectory = new HashMap<>();

    public void addPhone(PersonName personName, String number) {
        telephoneDirectory.put(personName, number);
    }

    public Set<Map.Entry<PersonName, String>> printTelephoneDirectory() {
        return telephoneDirectory.entrySet();
    }
}
