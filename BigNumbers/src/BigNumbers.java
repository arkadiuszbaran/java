//zad. 70
//ćw. 1

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        final String fileName = "numbers.txt";

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader)
        ) {
            int lines = 0;
            int sumInt = 0;
            BigInteger sumBigInt = BigInteger.ZERO;
            for (; lines < 3; lines++)
                sumInt += Integer.parseInt(bufferedReader.readLine());
            BigInteger tmp = null;
            for (; lines < 5; lines++){
                tmp = new BigInteger(bufferedReader.readLine());
                sumBigInt = sumBigInt.add(tmp);
            }
            System.out.println(sumInt);
            System.out.println(sumBigInt);
        } catch (FileNotFoundException e){
            System.err.println("Nie znaleziono pliku");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
