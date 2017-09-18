package SortAlgo;

public class ShellSort extends BaseSort {
    @Override
    public void sort(Comparable[] a) {
        int len=a.length;
        int h=1;
        while (h<len/3)
            h=3*h+1;
        while (h>=1){
            for (int i=h;i<len;i++){
                for (int j=i;j>=h&&less(a[j],a[j-h]);j-=h){
                    exch(a,j,j-h);
                }
            }
            h=h/3;
        }
    }

    public static void main(String[] args) {
        Integer[] array=new Integer[]{3,5,2,1,8,99,7,5,4,66,77,55,3,4,66};
        BaseSort sort=new ShellSort();
        sort.sort(array);
        sort.show(array);
       }

}
