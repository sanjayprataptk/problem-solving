package printUtils;

public class printUtils {
    public static <E> void printArray(E[] ns) {
        for (E element : ns) {
            System.out.print(element + " ");
        }
        System.out.println();  }

}
