public class Selection_sort {
    public static void main(String[] args) {
        int[] sort = {5,4,3,2,1};

        for(int i = 0; i < sort.length; i++) {
            for(int j = i + 1; j < sort.length; j++) {
                if(sort[j] < sort[i]) {
                    int aux = sort[i];
                    sort[i] = sort[j];
                    sort[j] = aux;

                }
            }
            
            System.out.println(sort[i]);
        }
        
    }
}
