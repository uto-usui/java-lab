package prog11_2;

class LockableJewelBox extends JewelBox implements Lockable {
    private boolean isLock = false;
    private String keyToken = "";

    public LockableJewelBox(boolean e) {
        super(e);
    }

    public boolean lock(MyKey key) {
        keyToken = key.getKeyToken();
        isLock = true;
        return isLock;
    }

    public boolean unlock(MyKey key) {
        if (keyToken.equals(key.getKeyToken())) {
            isLock = false;
        }
        return !isLock;
    }

    public void printEmpty() {
        if (isLock) System.out.println("ロックされています.");
        else super.printEmpty();
    }
}
