int findPositive(int [] numbers) {
    int minPos = 1
    for (num in numbers) {
        if (num > 0) {
            if ((num - minPos) == 0) {
                minPos++
            } 
        }
    }
    return minPos
}

findPositive([1, 2, 3, 6, 2, 7, 0] as int [])