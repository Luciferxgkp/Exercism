class ReverseString {
    String reverse(String inputString) {
        String str = "";
        for (int index = 0; index < inputString.length(); index++) {
            str = inputString.charAt(index) + str;
        }
        return str;
    }

}
