package ku.shop;

public class NotEnoughProdectsException extends Exception {
    public NotEnoughProdectsException() {}
    public NotEnoughProdectsException(String reason) {
        super(reason);
    }
}
