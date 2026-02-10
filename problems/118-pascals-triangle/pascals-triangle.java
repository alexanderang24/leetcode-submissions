class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                res.add(List.of(1));
                continue;
            }

            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < res.get(i-1).size() - 1; j++) {
                row.add(res.get(i-1).get(j) + res.get(i-1).get(j+1));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}