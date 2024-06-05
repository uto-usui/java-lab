package prog11_4;

public class Kinko extends LockableItem {
    private boolean isLock = false;
    private int deposit = 0;
    private String keyToken = "";

    public Kinko(int d) {
        deposit = d;
    }

    void printDeposit() {
        if (isLock) System.out.println("ロックされています");
        else System.out.println("預金額は " + deposit + " です");
    }
}
