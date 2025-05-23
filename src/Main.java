import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,5));
        int k = 2;

        List<Double> averages = getRollingAverage(arr, k);
        System.out.println("Средние значения подмассивов: " + averages);
    }

    private static List<Double> getRollingAverage(ArrayList<Integer> arr, int k) {
        LinkedList<Integer> subList = new LinkedList<>();
        List<Double> averages = new ArrayList<>();

        double sum = 0;

        for (int i = 0; i < k; i++){
            subList.add(arr.get(i));
        }
        System.out.println(subList);

        for (int num : subList) {
            sum += num;
        }
        System.out.println("Среднее значение подмассива: " + (sum / k));
        averages.add(sum / k);

        for (int i = k; i < arr.size() ; i++){
            subList.add(arr.get(i));
            subList.remove();
            System.out.println(subList);
            sum = 0;
            for (int num : subList) {
                sum += num;
            }
            System.out.println("Среднее значение подмассива: " + (sum / k));
            averages.add(sum / k);
        }
        return averages;
    }
}