public class QuickSort {

    public static int[] a= new int[]{1, 90, 2, 32, 3, 44, 4, 92, 7};

    public static void quickSort(int left,int right){
        int i,j,t,temp;
        if (left>right){
            throw new RuntimeException("左节点序号不得大于右节点");
        }
        temp=a[left];//基准数
        i=left;
        j=right;
        while (i!=j){
            while (a[j]>=temp&&i<j)
                j--;
            while (a[i]<=temp&&i<j)
                i++;
            if (i<j){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        a[left]=a[i];
        a[i]=temp;
        if (i-1>left){
            quickSort(left,i-1);
        }
        if (i+1<right){
            quickSort(i+1,right);
        }


    }

    public static void main(String[] args) {

        quickSort(0,a.length-1);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


}
