package Bai2;

public class MainService {
    private final CircuitBreaker circuitBreaker = new CircuitBreaker();
    private final RemoteService remoteService = new RemoteService();

    public String processRequest() {
        return circuitBreaker.execute(remoteService);
    }
}
