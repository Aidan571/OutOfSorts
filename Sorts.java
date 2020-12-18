import java.util.Arrays;
public class Sorts{
  public static void bubbleSort(int[] data){
    int leng = data.length;
    int holder = 0;
    for(int i = 0; i < leng - 1; i++){
      for(int j = 1; j < (leng - i); j++){
        if(data[j-1] > data[j]){
          holder = data[j-1];
          data[j-1] = data[j];
          data[j] = holder;
        }
      }
    }
  }

  public static void selectionSort(int[] data){
    for(int i = 0; i < data.length - 1; i++){
      int minimum = i;
      for(int j = i + 1; j < data.length; j++){
        if(data[j] < data[minimum]){
          minimum = j;
        }
      }
      int holder = data[minimum];
      data[minimum] = data[i];
      data[i] = holder;
    }
  }

  public static void insertionSort(int[] data){

  }
}
