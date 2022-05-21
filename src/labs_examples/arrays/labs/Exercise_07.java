package labs_examples.arrays.labs;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList <String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        for (String loop : letters) {
            System.out.print(loop + " ");
        }
        letters.remove(2);
        System.out.println();
        for (String loop : letters) {
            System.out.print(loop + " ");
        }
        letters.add(2, "C");
        System.out.println();
        for (String loop : letters) {
            System.out.print(loop + " ");
        }
        System.out.println();
        System.out.println(letters.get(2));
        System.out.println(letters.size());
    }
}
