class Solution {
    public int[] shuffle(int[] nums, int n) {
    int[] temp = new int[2*n];
    int a=0,t=n;
    for(int i=0;i<n*2;i++){
        if(i%2==0){
            temp[i]=nums[a];
            a++;
        }
        else{
            temp[i]=nums[t];
            t++;
        }
    } 
    return temp;   
    }
}