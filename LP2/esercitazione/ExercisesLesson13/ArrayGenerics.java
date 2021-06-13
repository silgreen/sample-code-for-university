public class ArrayGenerics{
    /**this method accept every type of array because is parametric */
    static <T> T getMedian(T[] arr) {
        return arr[(arr.length - 1) / 2];
    }

    public static void main(String[] args) {
        String [] str = {"luis","brad","milo","gio"};
        Integer [] integ = {1,2,3,4,5,6,7,8,9,10};
        /**And so on */

        System.out.println(str.length);
        System.out.println(getMedian(str));
        System.out.println(getMedian(integ));
    }
}
