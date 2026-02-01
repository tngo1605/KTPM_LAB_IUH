package Bai2;

public class CircuitBreaker {

    private int failureCount = 0;
    private final int failureThreshold = 3;
    private boolean open = false;

    public String execute(RemoteService service) {
        if (open) {
            return fallback();
        }

        try {
            String response = service.call();
            reset();
            return response;
        } catch (Exception e) {
            failureCount++;
            System.out.println("Failure count: " + failureCount);

            if (failureCount >= failureThreshold) {
                open = true;
                System.out.println("Circuit Breaker OPEN");
            }
            return fallback();
        }
    }

    private void reset() {
        failureCount = 0;
        open = false;
    }

    private String fallback() {
        return "Fallback response (Service temporarily unavailable)";
    }
}

