import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("james");
        st.add("scott");
        st.add("kal");
        System.out.println(st);
        System.out.println(st.contains("james"));
        System.out.println(st.size());
        st.remove("james");
        System.out.println(st.contains("james"));
        System.out.println(st.size());
        System.out.println(st);
        for (String s : st) {
            System.out.println(s);
        }
    }

}
