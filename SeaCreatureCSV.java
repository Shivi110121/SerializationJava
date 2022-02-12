package writingCSVFileinJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SeaCreatureCSV 
{
	public static void main(String[] args) throws IOException
	{
		String[][] seaCreatures = {
                {"Killer Whale","328"},
                {"Great White Shark", "3900"},
                {"Octopus", "13100"},
                {"Starfish", "20000"},
                {"Lobster", "100"}
        };
		
		File csvSeaCreatures = new File("seaCreatures.csv");
		FileWriter depthAndNames = new FileWriter(csvSeaCreatures);
		
		for (String[] data : seaCreatures) 
		{
		    StringBuilder line = new StringBuilder();
		    for (int i = 0; i < data.length; i++) {
		        line.append(data[i]);
		        if (i != data.length - 1) {
		            line.append(',');
		        }
		    }
		    line.append("\n");
		    depthAndNames.write(line.toString());
		}
		depthAndNames.close();
		

	}

}
