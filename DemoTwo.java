public class DemoTwo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Kapila");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Gunasena");
        System.out.println(sb);
    }
}
