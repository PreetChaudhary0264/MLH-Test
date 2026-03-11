public class TestGG{
    public static void main(String[] args) {
        int ans = bitwiseComplement(5);
        System.out.println(ans);
    }

    public static int bitwiseComplement(int n) {
        if(n == 0)return 1;
        int ans = 0;
        int i = 32 - Integer.numberOfLeadingZeros(n) - 1;
        for(; i >= 0; i--){
            if(((n >> i) & 1) == 0){
                ans |= (1 << i);
            }
        }
        return ans;
    }
}