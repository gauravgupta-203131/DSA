public class Sorted1 {
    public static boolean sorted(int[] arr, int idx) {
        if (idx <= arr.length - 2) {
            if (arr[idx] <= arr[idx + 1])
             return   sorted(arr, idx + 1);
            else
                return false;
        }
        return true;

    }

    public static void main(String[] arrr) {
        int[] arr = { 1, 2, 3, 4, 3,5 };
        System.out.println(sorted(arr, 0));
    }

}
