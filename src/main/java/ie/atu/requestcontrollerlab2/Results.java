package ie.atu.requestcontrollerlab2;

public class Results {
    private String operation;
    private Object total;

    public Results(String operation, Object total) {
        this.operation = operation;
        this.total = total;
    }

    public String getOperation() {
        return operation;
    }

    public Object getTotal() {
        return total;
    }
}
