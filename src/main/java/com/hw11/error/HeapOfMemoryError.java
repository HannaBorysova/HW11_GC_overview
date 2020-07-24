package main.java.com.hw11.error;

public class HeapOfMemoryError {
    public static final int MAX_ARRAY_RANGE = 1_300_000_000;

    public void printHeapOfMemoryError(){
        int[] newArray = new int[MAX_ARRAY_RANGE];
            System.out.println(newArray);
    }
}
