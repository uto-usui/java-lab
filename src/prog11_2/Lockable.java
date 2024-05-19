package prog11_2;

public interface Lockable {
    boolean lock(MyKey key);
    boolean unlock(MyKey key);
}
