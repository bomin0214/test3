package server;

public class Sort {

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int value = a[i];
            int j;
            for (j = i - 1; j >= 0; --j)
                if (a[j] > value)
                    a[j + 1] = a[j];
                else
                    break;
            a[j + 1] = value;
        }

        // 이걸 main이랑 병합하면 merge 됐다고 올라가는지 test
    }

}