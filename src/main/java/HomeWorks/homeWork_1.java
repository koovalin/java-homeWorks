package HomeWorks;

public class homeWork_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи число: ");
        int numToSort = Integer.parseInt(scan.next());
        int[] myArray = new int[]{3, 4, 6, 7, 5, 2, 1, 5, 4, 3, 2, 1, 4, 5, 4};
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Sorted array: " + Arrays.toString(arraySort(myArray, numToSort)));
    }
}
