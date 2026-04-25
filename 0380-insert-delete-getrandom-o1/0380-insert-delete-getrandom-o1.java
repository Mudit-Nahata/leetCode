class RandomizedSet {
    private Set<Integer> set;
    public RandomizedSet() {
       set = new HashSet<>(); 
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = set.toArray(new Integer[set.size()]);
        Random rndm = new Random();
        int index = rndm.nextInt(set.size());
        return arrayNumbers[index];

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */