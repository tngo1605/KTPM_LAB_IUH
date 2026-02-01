package Bai2;

import java.util.Random;

public class RemoteService {

    public String call() {
        // Giả lập lỗi ngẫu nhiên
        if (new Random().nextInt(10) < 7) {
            throw new RuntimeException("Service B is DOWN");
        }
        return "Data from Service B";
    }
}

