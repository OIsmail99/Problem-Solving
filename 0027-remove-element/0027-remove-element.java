class Solution {
public int removeElement(int[] nums, int val) {
//two pointers, count and i. count will track all the elements that are not val.
//if nums[i] is val --> skip and don't increment count.
//Yet another direction of thought is to consider the elements to be removed as non-existent. In a single pass, if we keep copying the visible elements in-place, that should also solve this problem for us.
int count=0; 
for(int i=0;i<nums.length;i++){ 
    if(nums[i]!=val){
    nums[count]=nums[i];
    count++;
    }
}
return count; //length of modified array.
}
}