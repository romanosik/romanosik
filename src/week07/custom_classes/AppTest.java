package week07.custom_classes;

public class AppTest {
    public static void main(String[] args) {
        App app = new App();
        app.name = "discord";
        app.version = 0.319;
        app.isFree = true;

        System.out.println(app);

        app.run();
        app.update();

        System.out.println(app);
    }
}
