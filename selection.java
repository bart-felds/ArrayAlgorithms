public class selection {
    public static void main(String[] args) {
        String classes[] = {"English", "Math", "Spanish", "History", "Comp Sci", "Lunch", "Chem", "Chem"};
// In order to avoid an out of bounds error you have to make sure that you don't start from the very last index, and subtract by 1.
        for (int i = 0; i < classes.length - 1; i++) {
            System.out.println(classes[i] + " - " + classes[i+1]);
        }
    }
}
