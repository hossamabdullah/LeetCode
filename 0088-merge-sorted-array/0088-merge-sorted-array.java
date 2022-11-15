class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                res[k] = nums1[i];
                i++;
            }else{
                res[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        for(int a=0; a<m+n; a++){
            System.out.print(res[a]);
        }
        System.out.println();
        System.out.println(i+"-"+m+","+j+"-"+n+","+k);
        while(i<m){
            res[k] = nums1[i];
            k++;
            i++;
        }
        System.out.println(i+"-"+m+","+j+"-"+n+","+k);
        while(j<n){
            res[k] = nums2[j];
            k++;
            j++;
        }
        System.out.println(i+"-"+m+","+j+"-"+n+","+k);
        
        for(int a=0; a<m+n; a++){
            nums1[a] = res[a];
        }
        nums1 = res;
    }
}