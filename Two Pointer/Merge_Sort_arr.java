class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
       int mind = m - 1;
       int nind = n - 1;
       int right = m + n - 1;

       while(nind >= 0)
       {
        if(mind >= 0 && num1[mind] > num2[nind]){
            num1[right] = num1[mind];
            mind--;
        }
        else
        {
            num1[right] = num2[nind];
            nind--;
        }
        
        right--;

       }
    }
}