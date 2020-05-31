/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=0, end=n;
       int mid=0; 
        while(start<end){
            mid=start +(end-start)/2;
            if(isBadVersion(mid)){
                //System.out.print("Then "+mid+" is the bad version");
            end=mid;
            }

            else
               start=mid+1;
 
    
               }
        if(start==end && isBadVersion(start))
            return end;
        
        return 0;
    }
}
