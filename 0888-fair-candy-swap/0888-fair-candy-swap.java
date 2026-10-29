class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int A = 0;
        int B = 0;
        Set<Integer> set = new HashSet<>();

        for (int x : aliceSizes) A += x;
        for (int x : bobSizes) {
            B += x;
            set.add(x);
        }

        int diff = (B - A) / 2;

        for (int x : aliceSizes) {
            if (set.contains(x + diff))
                return new int[]{x, x + diff};
        }

        return new int[]{};
    }
}