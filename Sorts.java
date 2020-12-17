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
}
