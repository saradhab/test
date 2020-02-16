public class SortDemo {
    public static void main (String[] args) {
        int a[] = {15, 12, 9, 17, 1};
        for (int i = 0; i < a.length; i++) {
            int smallest = a[i];
            boolean swap = false;
            int swapindx = 0;
            int temp = 0;
            //inner loop starts at i+1
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < smallest) {
                    smallest = a[j];
                    swap = true;
                    swapindx = j;
                }
            }

            //swap if smallest found
            if (swap) {
                temp = a[swapindx];
                a[swapindx] = a[i];
                a[i] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}






