package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
	public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0, j=0;
        ArrayList<Integer> intersectList = new ArrayList<>();
        
        while(i<nums1.length && j<nums2.length) {
        	if(nums1[i] == nums2[j]) {
        		intersectList.add(nums1[i]);
        		i++; j++;
        	}
        	else if (nums1[i]<nums2[j])
        		i++;
        	else
        		j++;
        		
        }
        
        int[] finalList = new int[intersectList.size()];
        
        for(int k = 0; k< finalList.length; k++) {
        	finalList[k] = intersectList.get(k);
        }
        
        return finalList;
    }
	
	public static void main(String args[]) {
		int[] a1 = {1,2,2,1};
		int[] a2 = {2,2};
		
		int[] intersectlist = intersect(a1,a2);
		
		for(int i = 0; i<intersectlist.length; i++) {
			System.out.println(intersectlist[i]);
		}
	}
}
