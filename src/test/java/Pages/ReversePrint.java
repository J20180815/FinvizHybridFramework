package Pages;
import java.util.*;

public class ReversePrint {
    private Object days;

    public void reverseString(String input){
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        // Store result in reverse order into the
        // result byte[]
        for (int i =0; i< strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        System.out.println(new String(result));
        // Use StringBuilder to create revert print.
        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(input);
        // reverse StringBuilder input1
        input1.reverse();
        // print reversed String
        System.out.println(input1);

        StringBuffer sbr = new StringBuffer(input);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);

        char[]  output = input.toCharArray();
        for (int i = output.length- 1; i >= 0; i--)
            System.out.print (output[i]);
    }
    public void reverseArray (int[] input) {
        System.out.println("original array : " + Arrays.toString(input));
        // handling null, empty and one element array
        if(input == null || input.length <= 1){
            return;
        }
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }

        System.out.println("reversed array : " + Arrays.toString(input));
    }

    public int reverseInt (int input){

            int reversed = 0;
            while(input != 0) {
                int digit = input % 10;
                reversed = reversed * 10 + digit;
                input /= 10;
                }
            return reversed;

    }
    public void PrintCharFromString (String input,int a){
        char c = input.charAt(a);
        System.out.println(c);

    }
    public int printStringtoIn (String input){
        int i = Integer.parseInt (input);
        return i;
    }
    public void  ArraysSort (int[] arr) {
        Arrays.sort(arr);
        System.out.printf("Array after sort is : %s ", Arrays.toString (arr));

    }
    public boolean isPalindromeString (String input){
        for (int i= 0;i<input.length()/2 ;i++){
            if (input.charAt(i) != input.charAt(input.length()-1-i)) {
              return false;
            }
        }
        return true;
    }

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; nums.length > i; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

        public static int removeDuplicateElements(int[] arr, int n) {

            if (n == 0 || n == 1) {
               return n;
            }
            Arrays.sort(arr);
            int[] temp = new int[n];
            int j = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }
            temp[j++] = arr[n - 1];
            // Changing original array
            for (int i = 0; i < j; i++) {
                arr[i] = temp[i];
            }
            return j;
        }
    }

        /*
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p=head;

        ListNode p1=l1;
        ListNode p2=l2;
        while(p1!=null && p2!=null){
            if(p1.val < p2.val){
                p.next = p1;
                p1 = p1.next;
            }else{
                p.next = p2;
                p2 = p2.next;
            }
            p=p.next;
        }

        if(p1!=null){
            p.next = p1;
        }

        if(p2!=null){
            p.next = p2;
        }

        return head.next;
    } */






