package prog07;

abstract class Greeting {
    private static String name;

    public Greeting() {
        setName("言語名");
    }

    public Greeting(String name) {
        setName(name);
    }

    // フィールドnameのアクセスメソッドsetName及びgetNameの定義
    protected void setName(String name) {
        Greeting.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String morningGreeting();
}

public class JapaneseGreeting extends Greeting {
    public JapaneseGreeting() {
        super("日本語");
    }

    @Override
    public String morningGreeting() {
        return "おはようございます";
    }

    public static void main(String[] args) {
        JapaneseGreeting g = new JapaneseGreeting();
        System.out.println(g.getName());
        System.out.println(g.morningGreeting());
    }
}





