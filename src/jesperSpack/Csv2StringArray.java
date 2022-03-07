package jesperSpack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Csv2StringArray {
    public void csvArray() throws IOException {

        String columnsline;
        String valueFile;
        String tablename = "dog_data";
        String fileAdress = "src/jesperSpack/dog_breeds.csv";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAdress));

        columnsline = bufferedReader.readLine();

            System.out.println("INSERT INTO " + tablename + "( " + columnsline + " )");

            for (int i = 0; i < columnsline.length(); ++i) {
                valueFile = bufferedReader.readLine();

                System.out.println("VALUES ( " + valueFile + " );");



            }
        bufferedReader.close();

    }
}
