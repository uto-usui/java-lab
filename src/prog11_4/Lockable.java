package prog11_4;

public interface Lockable {
    boolean lock(MyKey key);
    boolean unlock(MyKey key);
}
