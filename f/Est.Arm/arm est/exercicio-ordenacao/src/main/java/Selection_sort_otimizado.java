public class Selection_sort_otimizado {
    public static void main(String[] args) {
        int[] sort = {5,4,3,2,1};
        int i, j, indMenor;

        for( i = 0; i < sort.length; i++) {
             indMenor = i;
            for( j = i + 1; j < sort.length; j++) {
                if(sort[j] < sort[indMenor]) {
                    indMenor = j;

                }
            }

            int aux = sort[i];
            sort[i] = sort[indMenor];
            sort[indMenor] = aux;

            System.out.println(sort[i]);
        }

    }
}
