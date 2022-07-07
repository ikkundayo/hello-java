public class App {
    public static void main(String[] args) throws Exception {

        String msg = "happy";
        boolean a = true;
        int b = 15;
        b++;

        System.out.println(msg);
        System.out.println(a);
        System.out.println(b);

        int c = 91;
        if (c < 20) {
            System.out.println("bad");
        } else if (c < 40) {
            System.out.println("soso");
        } else {
            System.out.println("greet");
        }

        String d = c > 90 ? "genius" : "bad boy";
        System.out.println(d);

    }
}
