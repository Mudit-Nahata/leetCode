class Solution {
    public int hIndex(int[] citations) {
        
        int[] noOfCitations = new int[citations.length + 1];

        for (int citation : citations) {
            noOfCitations[Math.min(citation, citations.length)]++;
        }

        int total = 0;
        for( int i = citations.length; i>=0; i--) {
            total += noOfCitations[i];
            if(total >= i) {
                return i;
            }
        }
        return 0;
    }

}