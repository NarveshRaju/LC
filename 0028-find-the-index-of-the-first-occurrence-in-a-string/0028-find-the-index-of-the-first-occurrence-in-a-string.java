class Solution {
    public int strStr(String haystack, String needle) {
        int pointer = 0;
        int occurance = -1;
        int haySize = haystack.length();
        int needleSize = needle.length();
        int temp = 0;

        if (needleSize > haySize) return -1;

        for (int i = 0; i < haySize; i++) {
            if (needle.charAt(pointer) == haystack.charAt(i)) {
                occurance = i;
                pointer++;
                temp = i + 1;
                while (pointer < needleSize && temp < haySize) {
                    if (needle.charAt(pointer) == haystack.charAt(temp)) {
                        pointer++;
                        temp++;
                    } else {
                        occurance = -1;
                        pointer = 0;
                        break;
                    }
                }
                // OUTSIDE while, reset if not full match
                if (pointer == needleSize) return occurance;
                else { occurance = -1; pointer = 0; }
            }
        }
        return occurance;
    }
}