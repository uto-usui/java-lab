package teikyo.ics.csp1lec14;

public class Lec14Main2 {

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("クラス名を指定してください");
            }

            String targetClassName;
            if (args.length < 2) {
                throw new IllegalArgumentException("クラス名を指定してください");
            }
            targetClassName = args[1];

            Class<?> c = Class.forName(targetClassName);
            System.out.println("Target class is " + c.getCanonicalName());

            Class<?> s = c.getSuperclass();
            while (s != null) {
                System.out.println("Super class is " + s.getCanonicalName());
                s = s.getSuperclass();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("指定されたクラスが見つかりません: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
