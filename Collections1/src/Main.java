import java.util.*;

public class Main {
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static void main(String[] args) {

        HashMap<Integer, String> isMap = new HashMap<>();
        HashMap<String, Integer> tempMap = new HashMap<>();

        isMap.put(1, "один");
        isMap.put(2, "два");
        isMap.put(3, "три");
        //for (Map.Entry<Integer,String>entry :isMap.entrySet()){
        //    System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        //}
        for (Map.Entry<Integer, String> change : isMap.entrySet()) {
            tempMap.put(change.getValue(), change.getKey());
        }
        System.out.println(GREEN + "1: меняем местами пары ключ значение в HashMap" + RESET);
        System.out.println("Integer, String: " + isMap);
        System.out.println("String, Integer: " + tempMap);

        //for (Map.Entry<String,Integer>entry : tempMap.entrySet()){
         //   System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        //}

        ArrayList<String> surnames = new ArrayList<>();
        surnames.add("Ivanov");
        surnames.add("Ivanov");
        surnames.add("Petrov");
        surnames.add("Petrov");
        surnames.add("Sidorov");

        System.out.println(GREEN + "2: удаление дубликатов из Arraylist" + RESET);
        System.out.println("Surnames Arraylist: " + surnames );

        HashSet<String> surnamesSet = new HashSet<>();

        surnamesSet.addAll(surnames);

        System.out.println("результат добавления Arraylist в HashSet без дубликатов " + surnamesSet);

        System.out.println(GREEN + "3: ArrayList и LinkedList время выполнения на извлечение элемента " + RESET);

        Random random = new Random();

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < 1000; i++) {
            arrayList.add (random.nextInt(1000000));
            linkedList.add (random.nextInt(1000000));

            }
        long startTimeArrayList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int randomIndex = random.nextInt(arrayList.size());
            arrayList.get(randomIndex);
        }
        long endTimeArrayList = System.nanoTime();
        long durationArrayList = endTimeArrayList - startTimeArrayList;

        long startTimeLinkedList = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            int randomIndex = random.nextInt(linkedList.size());
            linkedList.get(randomIndex);
        }
        long endTimeLinkedList = System.nanoTime();
        long durationLinkedList = endTimeLinkedList - startTimeLinkedList;

        System.out.println("Количество элементов из ArrayList: " + arrayList.size());
        System.out.println("Время выполнения для ArrayList: " + durationArrayList + " наносекунд");

        System.out.println("Количество элементов из LinkedList: " + linkedList.size());
        System.out.println("Время выполнения для LinkedList: " + durationLinkedList + " наносекунд");

        System.out.println("Время выполнения linkedList больше  в " + durationLinkedList / durationArrayList + " раз(а)");
        System.out.println(YELLOW +"ArrayList основан на массиве. Доступ к элементу осуществляется за константное время O(1), так как массив позволяет прямой доступ к элементам по индексу." +
                "\nLinkedList список где каждый элемент содержит ссылку на следующий," +
                " для получения элемента необходимо пройти от начала списка до нужного элемента по пути из ссылок," +
                " что требует линейного времени O(n) . " +
                "Время выполнения зависит от позиции элемента." + RESET);
    }
}
