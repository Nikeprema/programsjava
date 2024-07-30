class obito{
    String color = "red";
    int wheel = 4;
    String name = "bike";

    public void run() {
        System.out.println("color: " + this.color + ", wheel: " + this.wheel + ", name: " + this.name);
    }
}

public class madara {
    public static void main(String[] args) {
        obito c = new obito();
        c.color = "red";
        c.wheel = 4;
        c.name = "car";
        c.run();
    }
}
