class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder builder = new StringBuilder();
        for(String st: strs){
            if (st.equals("")){
            st = "^&*";
            builder.append(st).append("#!@");
            } else {
                builder.append(st).append("#!@");
            }
        }
        String sb = builder.toString();
        return sb;
    }

    public List<String> decode(String str) {
        if (str.equals("")) return Arrays.asList();
        String[] st = str.split("#!@");
        List<String> list = Arrays.asList(st);
        list.replaceAll(s -> s.equals("^&*") ? "" : s);
        return list;
    }
}
