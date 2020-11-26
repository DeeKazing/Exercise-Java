class ReverseString {
    String wordReversed = "";
    String reverse(String inputString) {
        for (int i = inputString.length() -1; i >= 0; i--) {
            wordReversed = wordReversed.concat(String.valueOf(inputString.charAt(i)));
        }
        return wordReversed;
    }
}
