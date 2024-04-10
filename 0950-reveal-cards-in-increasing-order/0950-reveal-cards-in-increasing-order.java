class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck); // Sort the deck in ascending order
        Deque<Integer> revealedOrder = new LinkedList<>();

        for (int i = deck.length - 1; i >= 0; i--) {
            if (!revealedOrder.isEmpty()) {
                revealedOrder.addFirst(revealedOrder.removeLast()); // Move the top card to the bottom
            }
            revealedOrder.addFirst(deck[i]); // Add the current card to the top of the deck
        }

        // Convert deque to array
        int[] result = new int[deck.length];
        int index = 0;
        for (int card : revealedOrder) {
            result[index++] = card;
        }
        return result;
    }
}