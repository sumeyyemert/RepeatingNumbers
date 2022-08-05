import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{10,20,20,10,10,20,5,20};

        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Tekrar Sayıları ");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int frequency = 1;
                for (int j = 0; j < arr.length; j++) {
                    if ((i != j) && (arr[i] == arr[j])) {
                        arr[j] = 0;
                        frequency++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + frequency + " kere tekrar edildi.");
            }
    }
}}