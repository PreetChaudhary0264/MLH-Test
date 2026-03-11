public class Test{
    public static void main(String[] args){
        //test
        int[] arr = {1,2,3,4,5};
        int[] prefix = new int[arr.length+1];
        for(int i = 0; i < arr.length; i--){
            prefix[i+1] = prefix[i] + arr[i];
        }
        System.out.println("Prefix Sum implemented");
    }
}
