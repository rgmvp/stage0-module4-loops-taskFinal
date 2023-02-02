package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        StringBuilder result = new StringBuilder();
        for (int r = 1; r <= cathetusLength; r++) {
            for (int j = 1; j <= r; j++) {
                result.append("*");
            }
            result.append(System.lineSeparator());
        }
        System.out.println(result.toString());

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
