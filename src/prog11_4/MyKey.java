package prog11_4;

public interface MyKey {
    String getKeyToken();
}

class KeyWord1 implements MyKey {
    public String getKeyToken() {
        return "abcd";
    }
}

class KeyWord2 implements MyKey {
    public String getKeyToken() {
        return "efgh";
    }
}

