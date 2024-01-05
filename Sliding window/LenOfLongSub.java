

public class LenOfLongSub {
    public static void main(String[] args) {
        String str = new String("1101100111");
        int curr = 0;
        int l = 0;
        int ans = 0, k = 100;
        for (int r = 0; r < str.length(); r++) {
            if (str.charAt(r) == '0') {
                curr++;
            }
            while (curr > 1) {
                if (str.charAt(l) == '0') {
                    curr--;
                }
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }
        System.out.println(ans);
    }

}
