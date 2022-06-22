package Test;

public class test4 {
    public static void main(String[] args) {
        int[] arr = {2,2,2, 4, 4,5, 6, 6, 7, 7, 8, 8};
        int result = countCluster(arr);
        System.out.println(result);
    }

    public static int countCluster(int[] arr) {
            int count = 0;
            int left = 0;
            boolean same = true;
            for(int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    left = arr[i];
                } else{
                    if (arr[i] == left) {
                        if (same) {
                            count++;
                            same = false;
                        }
                    } else {
                        left = arr[i];
                        same = true;
                    }
                }
            }
            return count;
        }
}

