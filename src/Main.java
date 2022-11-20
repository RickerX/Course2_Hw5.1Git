import Product.Product;
import TelephoneDirectory.TelephoneDirectory;
import TelephoneDirectory.PersonName;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static void separation() {
        System.out.println("=========================");
    }
    public static void main(String[] args) {
        separation();
        homeWorkOneTaskOne();
        separation();
        homeWorkOneTaskTwo();
        separation();
        homeWorkOneTaskTree();
        separation();
        homeWorkTwoTaskOne();
        separation();
        homeWorkTwoTaskTwo();
        separation();

    }

    private static void homeWorkOneTaskOne() {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.addPhone(new PersonName("Иван","Петров"),"89998882211");
        telephoneDirectory.addPhone(new PersonName("Роман","Суворов"),"+79998882222");
        telephoneDirectory.addPhone(new PersonName("Иван","Петров"),"89998882211");
        telephoneDirectory.addPhone(new PersonName("Олег","Миронов"),"8-999-888-22-33");
        telephoneDirectory.addPhone(new PersonName("Семен","Петров"),"+78889993354");
        telephoneDirectory.addPhone(new PersonName("Павел","Сидоров"),"89998605222");
        telephoneDirectory.addPhone(new PersonName("Игрорь","Баранов"),"+7-920-720-22-67");
        telephoneDirectory.addPhone(new PersonName("Роман","Семенов"),"89992805128");
        telephoneDirectory.addPhone(new PersonName("Артем","Слонов"),"89285357729");
        telephoneDirectory.addPhone(new PersonName("Григорий","Семенцов"),"89998617792");
        telephoneDirectory.addPhone(new PersonName("Артем","Иманов"),"+78882863451");
        for (Map.Entry<PersonName, String> a : telephoneDirectory.printTelephoneDirectory()) {
            System.out.printf("%s - %s%n",a.getKey(),a.getValue());
        }
    }

    private static void homeWorkOneTaskTwo() {
        Map<Product, Integer> product = new HashMap<>();
        product.put(new Product("Банан",5), 4);
        product.put(new Product("Яблоко",15), 15);
        product.put(new Product("Арбуз",35), 6);
        product.put(new Product("Виноград",23), 8);
        for (Map.Entry<Product, Integer> p : product.entrySet()) {
            System.out.println(p);
        }
    }

    private static void homeWorkOneTaskTree() {
        HwOneTaskTree hwOneTaskTree = new HwOneTaskTree();
        hwOneTaskTree.addCode("код 1",1234);
        hwOneTaskTree.addCode("код 2",1324);
        hwOneTaskTree.addCode("код 3",1423);
        hwOneTaskTree.addCode("код 4",4321);
        hwOneTaskTree.addCode("код 5",3214);
        hwOneTaskTree.addCode("код 5",3214);
        for (Map.Entry<String, Integer> c : hwOneTaskTree.code.entrySet()) {
            System.out.println(c);
        }
    }

    private static void homeWorkTwoTaskOne() {
        HwTwoTaskOne hwTwoTaskOne = new HwTwoTaskOne();
        hwTwoTaskOne.getCollection();
        for (Map.Entry<String, List<Integer>> c : hwTwoTaskOne.task.entrySet()) {
            System.out.println(c);
        }
        // не получается создать новую коллекцию как сказано в условии
    }
    private static void homeWorkTwoTaskTwo() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "значение 10");
        map.put(1, "значение 1");
        map.put(2, "значение 2");
        map.put(3, "значение 3");
        map.put(9, "значение 9");
        map.put(4, "значение 4");
        map.put(5, "значение 5");
        map.put(6, "значение 6");
        map.put(8, "значение 8");
        map.put(7, "значение 7");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m);
        }
    }
}