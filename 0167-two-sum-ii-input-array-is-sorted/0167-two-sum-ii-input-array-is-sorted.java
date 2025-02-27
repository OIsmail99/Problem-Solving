class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length-1;
        int i = 0;
        int[] arr = {i,j};
        while(i < j){
            if(numbers[i] + numbers[j] == target) break;
            if(numbers[i] + numbers[j] < target){
                i++;
                continue;
            }
            else{
                j--;
                continue;
            }
        }
        arr[0] = i+1;
        arr[1] = j+1;
        return arr;
    }
}