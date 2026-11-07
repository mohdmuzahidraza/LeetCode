class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int x : nums) list.add(x);

        int count = 0;

        while (true) {
            int i = 1;
            while (i < list.size() && list.get(i) >= list.get(i - 1)) i++;
            if (i == list.size()) return count;

            int idx = 0;
            for (i = 1; i < list.size() - 1; i++)
                if (list.get(i) + list.get(i + 1) < list.get(idx) + list.get(idx + 1))
                    idx = i;

            list.set(idx, list.get(idx) + list.get(idx + 1));
            list.remove(idx + 1);
            count++;
        }
    }
}