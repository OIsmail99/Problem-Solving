class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArr = new int[nums1.length];
        int index = 0; //index for the newArr
        int first = 0; //index for first array
        int second = 0; //index for second array
        while(first < m && second < n){
            if(nums1[first] <= nums2[second]){
                newArr[index] = nums1[first];
                first++;
            }
            else{
                newArr[index] = nums2[second];
                second++; 
            }
            index++;
        }
        while(first < m){
            newArr[index] = nums1[first];
            first++;
            index++;
        }
        while(second < n){
            newArr[index] = nums2[second];
            second++;
            index++;
        }
        for(int i=0; i < nums1.length; i++){
            nums1[i] = newArr[i];
        }
    }
}