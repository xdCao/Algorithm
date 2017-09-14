package SortAlgo;

public abstract class BaseSort {

    public abstract void sort(Comparable[] a);

    public boolean less(Comparable v, Comparable w){
        return (v.compareTo(w)<0);
    }

    public void show(Comparable[] a){
        for (Comparable anA : a) {
            System.out.print(anA + " ");
        }
        System.out.println();
    }

    public void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    public boolean isSorted(Comparable[] a){
        for (int i=0;i<a.length;i++){
            if (less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }


}
