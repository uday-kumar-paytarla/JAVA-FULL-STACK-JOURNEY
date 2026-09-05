public class Main {
    public static void main(String[] args) {
    int []arr = new int[5];
    arr[0]=1;
    arr[1]=2;
    arr[2]=3;
    arr[3]=4;
    arr[4]=5;
    //the arr is the reference which points the elements stored in the heap memory.
    System.out.println("the elements in the array are: ");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }

}