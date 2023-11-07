package cn.nanchengyu.exer;

/**
 * ClassName: NpLifeValueException
 * Package: cn.nanchengyu.exer
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/7 17:56
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException {
    static final long serialVersionUID = -7034897190939L;
    public NoLifeValueException() {
    }


    public NoLifeValueException(String message) {
        super(message);

    }
}
