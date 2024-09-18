//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");
        System.out.println("Film: Top Gun: Maverick");

        int filmReleaseYear = 2022;
        System.out.println("Release Year: " + filmReleaseYear);

        boolean includedInThePlan = true;
        String filmSynopsis = """
                Sequencia de filme dos anos 80
                Com ator Tom Cruize
                """;
        System.out.println(filmSynopsis);

        double filmPublicScore = (8.1 + 9.3 + 6.6) / 3;
        System.out.printf("Public score: %f\n", filmPublicScore);

        int filmReviewScore = (int) (filmPublicScore / 2);
        System.out.printf("Review score: %d\n", filmReviewScore);

    }
}