import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> myList = new ArrayList<Integer>();

        if(nums1.length <= nums2.length)
        {
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if(nums1[i] == nums2[j] && !myList.contains(nums1[i]))
                    {
                        myList.add(nums1[i]);
                    }

                }
            }
        }
        else
        {
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if(nums2[i] == nums1[j] && !myList.contains(nums2[i]))
                    {
                        myList.add(nums2[i]);
                    }
                }
            }
        }

        int[] answer = new int[myList.size()];
        for (int i = 0; i < myList.size(); i++) {
            answer[i] = myList.get(i);
        }

        return answer;
    }
}
