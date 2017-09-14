package SortAlgo;

public class InsertSort extends BaseSort {
    @Override
    public void sort(Comparable[] a) {
        int len=a.length;
        for (int i=1;i<len;i++){
            for (int j=i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }


    public static void main(String[] args) {
        Integer[] array=new Integer[]{3,5,2,1,8,7,5,4,66,77,55};
        BaseSort sort=new InsertSort();
        sort.sort(array);
        sort.show(array);
    }


}
