package teikyo.ics.csp1lec14;

public class Lec14Main2 {

    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                throw new IllegalArgumentException("クラス名を指定してください");
            }

            String targetClassName;
            targetClassName = args[0];

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
