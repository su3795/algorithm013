public class BullsAndCows {
    public static String getHint(String secret, String guess) {
        int[] bucket = new int[10];
        int bull = 0;
        int cow = 0;
        //4
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)== guess.charAt(i)){
                bull++;
                continue;
            }
            System.out.println("secret.charAt(i)="+secret.charAt(i)+":secret.charAt(i)-'0'="+(secret.charAt(i)-'0'));
            System.out.println("guess.charAt(i)="+guess.charAt(i)+":guess.charAt(i)-'0'="+(guess.charAt(i)-'0'));
            bucket[secret.charAt(i) - '0'] += 1;
            bucket[guess.charAt(i) - '0'] -= 1;

        }
        //计算bucket中正值的个数
        for(int i=0;i<10;i++){
            if(bucket[i] > 0)
                cow+= bucket[i];
        }

        cow = secret.length() - cow - bull;
        String res = bull + "A" + cow + "B";
        return res;
    }

    public static void main(String[] args) {
        getHint("1123","0111");
    }
}
