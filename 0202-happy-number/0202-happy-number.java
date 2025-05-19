class Solution {
    private static List<Integer> numToArray(int n){
        String numStr = Integer.toString(n);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i < numStr.length(); i++){
            int num = numStr.charAt(i) - '0';
            list.add(num);
        }
        return list;
    }
    private static int sum(List<Integer> list){
        int sum = 0;
        for(Integer num: list){
            sum = sum + (num * num);
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            List<Integer> l = numToArray(n);
            int sum = sum(l);
            if(set.contains(sum)) {
                return false;
            }
            else{
                set.add(sum);
            }
            if(sum == 1) return true;
            n = sum;
        }
    }
}