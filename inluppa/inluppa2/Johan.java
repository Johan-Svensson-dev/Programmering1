package inluppa2;

public class Johan {

    public static void main(String[] args) {
    	System.out.println("");
        char[] chararray = fill(200); // Skapar en char-array med x antal tecken
        System.out.println(chararray);   // printar ut arrayn
        System.out.println("Antal 'a' i arrayen: " + counter(chararray)); // Räknar och skriver ut antalet 'a'   
        double andelA = calculatePercentage(chararray); // Beräknar andelen 'a' i arrayen
        System.out.println("Andel 'a' i arrayen: " + andelA + "%");
    }

    // metod för att fylla arrayn med gemener
    public static char[] fill(int storlek) {
        char[] chararray = new char[storlek];

        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = (char) ((int) ((Math.random() * (122 - 97)) + 97));   // fyller i med gemer med hjälp av ASCII
        }

        return chararray;

    }

    public static int counter(char[] chararray) {
        int count = 0;
        for (char c : chararray) {
            if (c == 'a') {             // "sökmetod" för att hitta a, för varje a=count++
                count++;
            }
        }
        return count;
    }

    // Beräknar andelen 'a' i arrayen och returnerar andelen som en double
    public static double calculatePercentage(char[] chararray) {
        int antalA = counter(chararray);
        int storlek = chararray.length;

        double andel = (double) antalA / storlek * 100; // Andel i procent
        return andel;
    }
}
