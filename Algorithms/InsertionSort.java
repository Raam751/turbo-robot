import java.util.*;
import java.io.*;

class Insertion{
  public void solve(int[] array){

    
    for(int i = 1; i<array.length; i++){

      int temp = array[i];
      
      int j = i - 1;


      while(j >= 0 && array[j] > temp){

        array[j + 1] = array[j];
        
        j--;

      }
      array[j + 1] = temp;
    }

  }

  public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the insertion sort
    public static void main(String[] args) {
        int[] numbers = {98, 15, 36, 96, 56, 26, 198};

        System.out.println("Original array:");
        printArray(numbers);

        Insertion sorter = new Insertion();
        sorter.solve(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
}

}
