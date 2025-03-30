import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,5));
        int k = 2;

        printSubarray(arr,k);
    }

<<<<<<< Updated upstream
    private static void printSubarray(ArrayList<Integer> arr, int k) {

=======
    private static List<Double> getRollingAverage(ArrayList<Integer> arr, int k) {
>>>>>>> Stashed changes
        LinkedList<Integer> subList = new LinkedList<>();

        double sum = 0;

        for (int i = 0; i < k; i++){
            subList.add(arr.get(i));
        }
        System.out.println(subList);

        for (int num : subList) {
            sum += num;
        }
        System.out.println("Среднее значение подмассива: " + (sum / k));

        for (int i = k; i < arr.size() ; i++){
            subList.add(arr.get(i));
            subList.remove();
            System.out.println(subList);
            sum = 0;
            for (int num : subList) {
                sum += num;
            }
            System.out.println("Среднее значение подмассива: " + (sum / k));
<<<<<<< Updated upstream


=======
            averages.add(sum / k);
>>>>>>> Stashed changes
        }
    }
}