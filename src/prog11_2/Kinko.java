package prog11_2;

public class Kinko implements Lockable, PrintState {
    private boolean isLock = false;
    private int deposit = 0;
    private String keyToken = "";

    public Kinko(int d) {
        deposit = d;
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

    public void print() {
        printDeposit();
    }

    void printDeposit() {
        if (isLock) System.out.println("ロックされています");
        else System.out.println("預金額は " + deposit + " です");
    }
}
