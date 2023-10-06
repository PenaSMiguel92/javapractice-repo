import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length < 1 || points[0].length < 1)
            return 0;
        sort(points, 0, points.length - 1);
        int arrow_pos = points[0][1];
        int arrows = 1;
        for (int[] point : points) {
            if (point[0] > arrow_pos) {
                arrow_pos = point[1];
                arrows++;
            }
        }
        Arrays.stream(points).forEach(e -> System.out.println(Arrays.toString(e)));
        
        return arrows;
    }

    public void sort(int arr[][], int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    public void merge(int[][] arr, int left, int middle, int right) {
        int len1 = middle - left + 1;
        int len2 = right - middle;

        int[][] Left = new int[len1][2];
        int[][] Right = new int[len2][2];

        for (int i = 0; i < len1; i++) {
            Left[i][0] = arr[left+i][0];
            Left[i][1] = arr[left+i][1];
        }

        for (int j = 0; j < len2; j++) {
            Right[j][0] = arr[middle+1+j][0];
            Right[j][1] = arr[middle+1+j][1];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < len1 && j < len2) {
            if (Left[i][1] <= Right[j][1]) {
                arr[k][0] = Left[i][0];
                arr[k][1] = Left[i][1];
                i++;
            } else {
                arr[k][0] = Right[j][0];
                arr[k][1] = Right[j][1];
                j++;
            }
            k++;
        }

        while (i < len1) {
            arr[k][0] = Left[i][0];
            arr[k++][1] = Left[i++][1];
        }

        while (j < len2) {
            arr[k][0] = Right[j][0];
            arr[k++][1] = Right[j++][1];
        }


    }
}
