package prog11_4;

class LockableJewelBox extends JewelBox {
    private LockableItem lockableItem = new LockableItem();

    public LockableJewelBox(boolean e) {
        super(e);
    }

    public boolean lock(MyKey key) {
        return lockableItem.lock(key);
    }

    public boolean unlock(MyKey key) {
        return lockableItem.unlock(key);
    }

    public void printEmpty() {
        if (lockableItem.isLocked()) {
            System.out.println("ロックされています.");
        } else {
            super.printEmpty();
        }
    }
}
