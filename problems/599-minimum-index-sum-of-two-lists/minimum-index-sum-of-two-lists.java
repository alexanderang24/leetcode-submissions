class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
            // System.out.println("added to map: " + list1[i] + " on index " + i);
        }

        List<String> list = new ArrayList<>();
        int indexSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if (map.containsKey(s)) {
                // System.out.println("map contains " + s);
                int temp = map.get(s) + i;
                // System.out.println("temp: " + temp + " indexSum: " + indexSum);
                if (temp == indexSum) {
                    list.add(s);
                    // System.out.println("added to list: " + s);
                } else if (temp < indexSum) {
                    indexSum = temp;
                    list = new ArrayList<>();
                    list.add(s);
                    // System.out.println("replaced to list: " + s);
                }
            }
        }

        return list.toArray(String[]::new);
    }
}