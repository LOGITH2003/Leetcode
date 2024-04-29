class Solution {
    Answer a = new Answer();
    public int numberOfSteps(int num) {
        if(num <= 0)
            return a.getCount();
        a.setCount(a.getCount()+1);
        return numberOfSteps(num%2==0?num/2:num-1);
    }
}
class Answer{
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count = 0;
}
