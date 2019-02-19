// O(2n) = O(n) space complexity
// o(n) time complexity
Boolean isAddsUp(List<Integer> numbers, Integer k) {
    Set remainders = new HashSet()
    for (number in numbers) {
        int remainder = k - number
        if (remainders.contains(number)) { // 0(1)
            return true
        }
        remainders.add(remainder) // O(1)
    }
    return false
}
isAddsUp([10, 15, 3, 7], 17)