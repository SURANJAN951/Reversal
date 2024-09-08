import java.util.Arrays;

public class Reversal {
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        int n = array.length;

        for(int i=0; i<n/2; i++){
            int temp = array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(array));
        //In your code, the line System.out.println(array); is printing the memory
        // address (or reference) of the array object, not the contents of the array itself.
        // In Java, when you print an object using System.out.println(), it calls the
        // toString() method of that object. Since arrays don't override the default
        // toString() method from the Object class, it prints the memory reference
        // instead of the actual elements.
    }
}
