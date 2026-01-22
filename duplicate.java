public class duplicate {

    public static void main(String[] args) {
        String classes[] = {"English", "Math", "Spanish", "Spanish", "Comp Sci", "Lunch", "Chem", "Chem"};
        boolean hasDuplicates = determine(classes);
        System.out.println("Has duplicates? " + hasDuplicates);
    }

    public static boolean determine(String[] classes) {
        boolean foundDuplicate = false;
        int i = 0;

        while (i < classes.length) {
           
            int j = i + 1;
         
            while (j < classes.length) {
                if (classes[i].equals(classes[j])) {
                    System.out.println("Duplicate found: " + classes[i]);
                    foundDuplicate = true;
                    break;  
                }
                j++;
            }
            
            i++;
        }

        return foundDuplicate;
    }
}
