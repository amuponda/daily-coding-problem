// O(2n) + 2c = O(n) space/time compelixity
int [] multiplier(int [] numbers) {
    int size = numbers.length  
    if (size) {
        int total = numbers[0]
        int [] result = new int[size]
        
        for (int i = 1; i < size; i++) {
            total *= numbers[i]
        }
        for (int i = 0; i < size; i++) {
            result[i] = total/numbers[i]    
        }
        return result
    }
}

multiplier([1, 2, 3, 4, 5] as int [])