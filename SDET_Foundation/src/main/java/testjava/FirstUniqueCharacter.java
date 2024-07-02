Public class FirstUniqueCharacters {
    public static void main(String[] args) {
        String s="leetcode";
        String[] chararr=s.toCharArray();

        for(int i=0;i<chararr.length();i++) {
            for (int j = 0; j < chararr.length; j++) {
                if (chararr[i] == chararr[j]) {
                    System.out.println(i);
                } else {
                    System.out.println(-1);
                }
            }
                }
            }
        }