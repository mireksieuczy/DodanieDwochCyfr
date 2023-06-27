//Zadanie: Napisz program, który zwraca sumę cyfr danej liczby.
//Podpowiedź: Możesz przekształcić liczbę na ciąg znaków, a następnie zsumować wartości poszczególnych cyfr.

public class Main {
    public static void main(String[] args) {
        int liczba = 1345;
        String ciagZnakow = String.valueOf(liczba);
        int suma = 0;
        for (int i = 0; i < ciagZnakow.length(); i++) {
            char cyfraChar = ciagZnakow.charAt(i); // pobranie kolejnej cyfry jako znak
            int cyfra = Character.getNumericValue(cyfraChar); // przekształcenie znaku na liczbę
            suma += cyfra; // dodanie cyfry do sumy
        }

        System.out.println(suma);

    }
}

