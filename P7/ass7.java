interface Sortable {
    void sort(int[] arr);
}
class BubbleSort implements Sortable{
    public void sort(int[] arr){
        int n = arr.length,temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class SelectionSort implements Sortable{
    public void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class ass7 {
    public static void main(String[] args) {
        int[] a = {64,3,74,7,2};

        System.out.println("Before Sorting: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
        System.out.println("\n\nAfter Bubble Sort: ");
        BubbleSort b = new BubbleSort();
        b.sort(a);

        System.out.println("\n\nAfter Selection Sort: ");
        SelectionSort s = new SelectionSort();
        s.sort(a);
    }
}
