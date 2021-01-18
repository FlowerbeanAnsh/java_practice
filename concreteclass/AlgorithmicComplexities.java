package concreteclass;

public class AlgorithmicComplexities {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i <array.length ; i=i+2) {
            System.out.println(array[i]);
            System.out.println("i" + "=" + i);
            // O(n/2)

        }


        // constant time complexity --
    }

    public static void readArrayValues(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
            //this is eg of O(n)
        }
    }
}
