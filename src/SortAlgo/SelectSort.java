package SortAlgo;

public class SelectSort extends BaseSort {
    @Override
    public void sort(Comparable[] a) {
        int len=a.length;
        for (int i=0;i<len;i++){
            int min=i;
            for (int j=i+1;j<len;j++){
                if (less(a[j],a[min])){
                    min=j;
                }
            }
            exch(a,i,min);
        }
    }

    public static void main(String[] args) {
        Integer[] array=new Integer[]{3,5,2,1,8,7,5,4,66,77,55};
        BaseSort sort=new SelectSort();
        sort.sort(array);
        sort.show(array);
    }

}
