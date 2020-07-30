public class _9_isPalindrome {

    /**
     * 方法一：这个方法比较绕
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String str = num2String(x);
        return isPalindrome(str);
    }

    /**
     * 方法二：直接判断，注意参数是负数的时候。
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        if(x < 0) return false;

        int saveX = x;
        int reverse = 0;
        while (x != 0){
            reverse = reverse * 10 + (x % 10);
            x /= 10;
        }
        return  reverse == saveX;
    }
    /**
     * 数字转字符串
     * @param x
     * @return
     */
    public String num2String(int x){
        StringBuffer sb = new StringBuffer();

        while (x != 0){
            sb.append(x%10);
            x /= 10;
        }
        return sb.reverse().toString();
    }

    /**
     * 判断字符串是不是回文，因为这个方法比较通用。
     * @param x
     * @return
     */
    public boolean isPalindrome(String x) {
        if(x == null) return false;

        int i, j;
        for (i = 0, j = x.length()-1; i < j ; i++, j--) {
            if(x.charAt(i) != x.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
