package Bai2;

public class Main {
    public static void main(String[] args) {

        MainService service = new MainService();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Request " + i + ": "
                    + service.processRequest());
        }
    }
}
