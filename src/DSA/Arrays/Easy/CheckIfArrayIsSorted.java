package DSA.Arrays.Easy;
///https://www.naukri.com/code360/problems/ninja-and-the-sorted-check_6581957?leftPanelTabValue=SUBMISSION
public class CheckIfArrayIsSorted {
    public static void main(String[] args) {

    }

    private static int isSorted(int[]a,int n){
        for(int i=1;i<a.length;i++){
            if(a[i]>=a[i-1]){
                continue;
            }
            else{
                return 0;
            }
        }
        return 1;
    }

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
        public boolean check(int[] nums) {
            int count=0;
            int length=nums.length;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>nums[(i+1)%length]){
                    count++;
                }
            }
            if(count>1){
                return false;
            }else{
                return true;
            }
        }
    }

