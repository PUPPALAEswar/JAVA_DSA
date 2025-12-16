class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            secondLargest=largest;
        }
        return secondLargest;
    }
}
