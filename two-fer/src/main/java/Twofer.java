public class Twofer {
    public String twofer(String name) {
        String result = "";
        if (name == null || name == "") {
            result = "One for you, one for me.";
        } else result = "One for " + name + ", one for me.";


        return result;
    }
}
