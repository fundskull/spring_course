package DFGdfkhn;


public class Bugatti {
    public static void main(String[] args) {
        String x = "[eq";
        String y = x;
        System.out.println(x == y);
    }
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public Bugatti(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
