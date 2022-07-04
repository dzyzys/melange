public class Kwadrat {
    double dlugoscBoku;

    Kwadrat(double bok) {
        dlugoscBoku = bok;
    }

    double obliczPole() {
        return dlugoscBoku * dlugoscBoku;
    }

    double obliczObwod() {
        return 4 * dlugoscBoku;
    }
}
