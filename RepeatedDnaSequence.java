//https://leetcode.com/problems/repeated-dna-sequences
//TC: 0(n)
//SC: 0(n)

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int l = s.length();
        Set<String> result = new HashSet<>();
        Set<String> set = new HashSet<>();
        for(int i =0 ;i<l-9;i++){
            String dna = s.substring(i,i+10);
            if(set.contains(dna)){
                result.add(dna);
            }else{
                set.add(dna);
            }
        }
        return new ArrayList<>(result);
    }
}
