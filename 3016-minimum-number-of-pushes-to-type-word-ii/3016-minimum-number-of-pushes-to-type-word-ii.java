class Solution {
    public int minimumPushes(String word) {
        int count = 0,point = 1,check = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : word.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Map.Entry<Character, Integer>> sortedEntries = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            if(check++ == 8)
            {
                check = 1;
                point++;
            }
            map2.put(entry.getKey(), point);
        }

        for(Character c : map.keySet())
            count += map.get(c) * map2.get(c);

        return count;
    }
}