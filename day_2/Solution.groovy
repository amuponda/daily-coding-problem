// O(n) time complexity 
// o(1) space complexity

public int[] productExceptSelf(int[] nums) {
    int [] befores = new int [nums.length];
    int tail = nums.length - 1;
    for(int i = 0; i < nums.length; i++) {
        if (i == 0) {
            befores[i] = 1;
        } else {
            befores[i] = befores[i-1] * nums[i-1];    
        }
    }
    
    int temp = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
        if (i == (nums.length - 1)) {
            befores[i] = befores[i]; 
        } else {
            temp *= nums[i + 1];
            befores[i] = befores[i] * temp;
        }
    }
    return befores;
}

productExceptSelf([1, 2, 3, 4] as int []);
