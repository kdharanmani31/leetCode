class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> change = new HashMap<>();
        change.put(5, 0);
        change.put(10, 0);
        change.put(20, 0);

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                change.put(5, change.get(5) + 1);
            }else if(bills[i] == 10){
                if(change.get(5) == 0){
                    return false;
                }
                change.put(5, change.get(5) - 1);
                change.put(10, change.get(10) + 1);
            }else if(bills[i] == 20){
                if(change.get(5) == 0 || (change.get(10) == 0 && change.get(5) < 3)){
                    return false;
                }
                if(change.get(10) > 0){
                    change.put(10, change.get(10) - 1);
                    change.put(5, change.get(5) - 1);
                }else if(change.get(5) >= 3){
                    change.put(5, change.get(5) - 3);
                }
                change.put(20, change.get(20) + 1);
            }
        }
        return true;
    }
}