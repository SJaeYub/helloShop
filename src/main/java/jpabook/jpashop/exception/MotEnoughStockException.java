package jpabook.jpashop.exception;

public class MotEnoughStockException extends RuntimeException {

    public MotEnoughStockException() {
        super();
    }

    public MotEnoughStockException(String message) {
        super(message);
    }

    public MotEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public MotEnoughStockException(Throwable cause) {
        super(cause);
    }

}
