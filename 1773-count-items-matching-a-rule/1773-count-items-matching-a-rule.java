class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0,index = 0;
        if("color".equals(ruleKey)) index = 1;
        if("name".equals(ruleKey)) index = 2;
        for (List<String> item : items) if (item.get(index).equals(ruleValue)) count++;
        return count;
    }
}