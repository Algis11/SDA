public class Ex05 {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();

        }
// Triangle 2
        System.out.println("Triangle 2");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == (size - 1) || (j == 0 || j == i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Rectangle with diagonals");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || (i == (size - 1))) { //pirma arba paskutine eilute
                    System.out.print("*");
                } else if (j == 0 || (j == (size - 1)) // sienos
                        || (i == j) || (j == (size - 1 - i))) { //istrizaines
                    System.out.println("*");
                } else
                    System.out.print(" ");
            }
        }
        System.out.println();
    }

}



















