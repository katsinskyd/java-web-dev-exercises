package exercises.Class1;

public class Arrays {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 5, 8};
        for (int i : values) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
        String samIAm = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] seuss = samIAm.split("not");
        for (String a : seuss) {
            System.out.println(a);
        }
    }
}
