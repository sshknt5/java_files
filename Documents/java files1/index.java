public class index {
    public static void main(String[] args) {
        int count=0;
        String name = "President George Washington";
        for(int i = name.indexOf('e');i<=name.lastIndexOf('e');i++){
            if(name.charAt(i)=='e') {
                count++;
            }
        }
        System.out.println(count);
    }
}
