package prog11_4;

public class LockableItem implements Lockable {
    protected boolean isLock = false;
    protected String keyToken = "";

    @Override
    public boolean lock(MyKey key) {
        keyToken = key.getKeyToken();
        isLock = true;
        return isLock;
    }

    @Override
    public boolean unlock(MyKey key) {
        if (keyToken.equals(key.getKeyToken())) {
            isLock = false;
        }
        return !isLock;
    }

    public boolean isLocked() {
        return isLock;
    }
}
