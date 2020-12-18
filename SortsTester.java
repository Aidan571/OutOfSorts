import java.util.Random;
import java.util.Arrays;
public class SortsTester{
  public static void main(String args[]){
    int[] tester0 = new int[10];
    Random rng0 = new Random(100);
    for(int i = 0; i < 10; i++){
      tester0[i] = (rng0.nextInt() % 1000);
    }
    System.out.println(Arrays.toString(tester0));
    System.out.println("Used bubbleSort on array");
    Sorts.bubbleSort(tester0);
    System.out.println(Arrays.toString(tester0));
    System.out.println();

    int[] tester1 = new int[100];
    Random rng1 = new Random(5050);
    for(int i = 0; i < 100; i++){
      tester1[i] = (rng1.nextInt() % 1000);
    }
    System.out.println(Arrays.toString(tester1));
    System.out.println("Used bubbleSort on array");
    Sorts.bubbleSort(tester1);
    System.out.println(Arrays.toString(tester1));
    System.out.println();

    int[] tester3 = new int[100];
    Random rng3 = new Random(5050);
    for(int i = 0; i < 100; i++){
      tester3[i] = (rng3.nextInt() % 1000);
    }
    System.out.println(Arrays.toString(tester3));
    System.out.println("Used SelectionSort on array");
    Sorts.selectionSort(tester3);
    System.out.println(Arrays.toString(tester3));
    System.out.println();

    int[] tester2 = new int[2];
    Random rng2 = new Random(2500);
    for(int i = 0; i < 2; i++){
      tester2[i] = (rng2.nextInt() % 1000);
    }
    System.out.println(Arrays.toString(tester2));
    System.out.println("Used bubbleSort on array");
    Sorts.bubbleSort(tester2);
    System.out.println(Arrays.toString(tester2));
    System.out.println();

    int[] tester4 = new int[10];
    Random rng4 = new Random(100);
    for(int i = 0; i < 10; i++){
      tester4[i] = (rng4.nextInt() % 1000);
    }
    System.out.println(Arrays.toString(tester4));
    System.out.println("Used InsertionSort on array");
    Sorts.insertionSort(tester4);
    System.out.println(Arrays.toString(tester4));
    System.out.println();
  }
}
