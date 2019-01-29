
/**
 * @author a.kovtun
 * @since 29.01.2019.
 */
public class Test {

    public static void main(String[] args) {
        int [] numbers = {6,5,8,9,7,17};
        System.out.println("Минимальное число массива равно " + min(numbers));
        numbers = new int[] {-2,0,-7,11};
        System.out.println("Минимальное число массива равно " + min(numbers));
        numbers = new int[] {11};
        System.out.println("Минимальное число массива равно " + min(numbers));
    }

    public static int min(int[] array){
        int res = array[0];
        for (int i : array){
          res = i < res? i:res;
        }
        return res;
    }
}
