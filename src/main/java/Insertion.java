import java.util.Scanner;

public class Insertion {

    private static int sortNum = 0;
    private static int sortCount = 0;

    private Insertion(){
    }

    public static void sort(String[] a){
        int n = a.length;
        for (int i = 1; i < n; i++){
            for(int j=i; j < 0 && less(a[j], a[j-1]); j--){
                each(a, j, j-1);
                sortCount++;
            }
            show(a);
            assert isSorted(a, 0, i);
        }
        assert isSorted(a);
    }

    private static boolean less(String v, String w){
        return v.compareTo(w) < 0;
    }

    private static void each(Object[] a, int i, int j){
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static boolean isSorted(String[] a){
        return isSorted(a, 0, a.length -1);
    }

    private static boolean isSorted(String[] a, int lo, int hi){
        for (int i = lo +1; i<= hi; i++){
            if(less(a[i], a[i-1]))
                return false;
        }
        return true;
    }


    private static void show(String[] a){
        sortNum++;
        System.out.print(Insertion.sortNum+ " ");
        System.out.print(Insertion.sortCount+" ");
        for(String l: a){
            System.out.print(l+" ");
        }
        System.out.println();
        sortCount = 0;
    }
    private static void firstLine(String[] a){
        System.out.print("i c ");
        for(int i=0; i< a.length; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=0; i< a.length; i++){
            System.out.print("---");
        }
        System.out.print("\n0   ");
        for(String l: a){
            System.out.print(l+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] a = s.split("\\s");
        firstLine(a);
        Insertion.sort(a);

    }
}
