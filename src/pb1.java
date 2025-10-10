import java.util.*;
import java.util.stream.Collectors;

public class pb1 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>(); // a
        Set<Integer> zSet = new TreeSet<>(); // b
        List<Integer> xMinusY = new ArrayList<>(); // c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>(); // d

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(10));
        }
        for (int i = 0; i < 5; i++) {
            y.add(rand.nextInt(10));
        }
        Collections.sort(x);
        Collections.sort(y);
        System.out.println(x);
        System.out.println(y);
        //a
        xPlusYLimitedByP.addAll(x);
        xMinusY.addAll(y);
        System.out.println(xPlusYLimitedByP);
        Collections.sort(xPlusY);
        System.out.println(xPlusY);

        //b
        for (Integer i : xPlusY) {
            if (y.contains(i)) {
            }
            zSet.add(i);
        }
        //c
        for (Integer i : xMinusY) {
            if (!y.contains(i)) {
                xMinusY.add(i);
            }
        }
        System.out.println(xMinusY);
        //d


        class Student {

            String numePrenume;
            String grupa;
            List<Integer> note = new ArrayList<>();

            Student(String numePrenume, String grupa) {
                this.numePrenume = numePrenume;
                this.grupa = grupa;
                for (int i = 0; i < 5; i++) {
                    note.add(4 + rand.nextInt(7));
                }
            }

            double Medie() {
                return note.stream().mapToInt(x -> x * x).sum();
            }

            long restantieri() {
                return note.stream().filter(n -> n < 5).count();
            }

            boolean trece() {
                return restantieri() == 0;
            }

            @Override
            public String toString() {
                return numePrenume + note;
            }

        }
        List<Student> studenti = Arrays.asList(
                new Student("Pop Ion", "A1"),
                new Student("Ion Mario", "A2"),
                new Student("Geo Mihai", "A1"),
                new Student("Dum Andrei", "A3"),
                new Student("Stancu Ene", "A2")
        );
        studenti.forEach(System.out::println);

    }
}