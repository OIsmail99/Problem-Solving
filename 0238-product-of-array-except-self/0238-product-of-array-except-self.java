class Solution {
    public int[] productExceptSelf(int[] nums) {
        //nums [1,2,3,4]   .. [-1,1,0,-3,3]
        //prefix [1,1,2,6] .. [1,-1,-1,0,0]
        //suffix [24,12,4,1] .. [0,0,-9,3,1]
        //[24,12,8,6]        ...[0,0,9,0,0]
        //[]
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        int[] answer = new int[nums.length];
        prefixProduct[0] = 1;
        suffixProduct[nums.length-1] = 1;
        
        for(int i=1; i < nums.length; i++){
            prefixProduct[i] = nums[i-1] * prefixProduct[i-1];
        }
        for(int i=nums.length-2; i >=0; i--){
            suffixProduct[i] = suffixProduct[i+1] * nums[i+1];
        }
        System.out.println(Arrays.toString(prefixProduct));
        System.out.println(Arrays.toString(suffixProduct));
        for(int i=0; i < answer.length; i++){
            answer[i] = prefixProduct[i] * suffixProduct[i];
        }
        return answer;
    }
    }
