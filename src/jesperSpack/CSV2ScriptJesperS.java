package jesperSpack;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSV2ScriptJesperS
{
    File fileIn = new File("src/jesperSpack/myCSVfile.csv"); // declaring a file and path called fileIn.
    BufferedReader bufRead = new BufferedReader(new FileReader(fileIn)); // Letting FileReader read it to a BufferedReader


    public CSV2ScriptJesperS() throws FileNotFoundException {
    }

    public void CSV2ScriptJesperS() throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Opret ny tabel.\n 2. Indsæt data i eksisterende tael.\n 3. Quit program.");
        System.out.println("Choice..: ");
        int sCasechoice = scanner.nextInt();
        System.out.print("Name of your MySQL TABLE.: ");
        String tblName = scanner.next();

        //String valueArray = (bufRead.readLine().split("," + "\n"));;



        switch (sCasechoice)
        {
            case 1:
                String[] line = bufRead.readLine().split("," + "\n");
                String myScript1 = ("CREATE "+tblName+" ( "+line[0]+" )");
                System.out.print(myScript1.toLowerCase());
            case 2:
                while ((bufRead.readLine()) != null) {
                    String valueArray = bufRead.readLine();
                
                    String myValues1 = ("INSERT INTO "+tblName+" VALUES ( "+valueArray+" );\n");
                    System.out.println(myValues1);

                    //todo lave separat metoder for table og values og flytte switch case over i main som met kald
                    }

        }

    }
}



/* String[] valueArray=null;
                    for (int i=0;i<valueArray.length;++i) {
                        int valueIndex = 1;
                        valueArray = bufRead.readLine().split("," + "\n");
                        valueArray[valueIndex] = bufRead.readLine();
                        valueIndex++;
                    }*/