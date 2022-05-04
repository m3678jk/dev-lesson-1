package goitpackage;

public class App {
    public static void main(String[] args) {
        Summarizer sum = new Summarizer();
        System.out.println("sum.sum(\"ABCDAAAC\") = " + sum.sum("ABCDAAAC"));
    }
}
