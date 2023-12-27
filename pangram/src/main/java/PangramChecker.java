public class PangramChecker {

    public boolean isPangram(String input) {
        String str = input.toLowerCase();
        int arr[] = new int[26];
        for (int i = 0; i < arr.length; i++) arr[i] = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;
            }
        }

        for (int ele : arr) {
            if (ele == 0) return false;
        }
        return true;
    }

}
