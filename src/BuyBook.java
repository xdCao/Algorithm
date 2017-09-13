import java.util.*;

public class BuyBook {

    private static void quickSort(int[] books,int left,int right) {
        int i,j,temp,t;
        i=0;
        j=right;
        temp=books[left];

        while (i!=j){
            while (books[j]>temp&&j>i){
                j--;
            }
            while (books[i]<temp&&i<j){
                i++;
            }
            if (i<j){
                t=books[i];
                books[i]=books[j];
                books[j]=t;
            }
        }
        if (left<i-1){
            quickSort(books,left,i-1);
        }
        if (right>i+1){
            quickSort(books,i+1,right);
        }
    }

    public static void main(String[] args) {
        int[] books=new int[]{33,22,44,11,33,44,22,33,23,44,56,65};
        int[] newArray = depulix(books);
        quickSort(newArray,0,newArray.length-1);
        for (int i:newArray){
            System.out.println(i);
        }
    }

    private static int[] depulix(int[] books) {
        List<Integer> booklist=new ArrayList<>();
        for (int b:books){
            booklist.add(b);
        }
        Set<Integer> bookset=new HashSet<>(booklist);
        Iterator iterator=bookset.iterator();
        int i=0;
        int[] array=new int[bookset.size()];
        while (iterator.hasNext()){
            array[i]= (int) iterator.next();
            i++;
        }
        return array;

    }


}
