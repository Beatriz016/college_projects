public class Bubble_sort {
    public static void main(String[] args) {
        int[] sort = {5,4,3,2,1};
        int i, j;

        for(i = 0; i < sort.length; i++) {
            for(j = 1; j < sort.length; j++) {
                if(sort[j - 1] > sort[j]) {
                    int aux = sort[i];
                    sort[i] = sort[j];
                    sort[j] = aux;

                }
            }
            System.out.println(sort[i]);
        }
    }
}
