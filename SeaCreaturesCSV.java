package csvTableProject;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SeaCreaturesCSV 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//String[][] seaCreatures = {
		  //              {"Killer Whale","328"},
		    //            {"Great White Shark", "3900"},
		      //          {"Octopus", "13100"},
		        //        {"Starfish", "20000"},
		          //      {"Lobster", "100"}
		        //};
				
				KillerWhale newSeaCreature = new KillerWhale();
				newSeaCreature.KillerWhaleMethod();
		
				//File csvSeaCreatures = new File("seaCreatures.csv");
				//FileWriter depthAndNames = new FileWriter(csvSeaCreatures);
				
				//for (String[] data : seaCreatures) 
				//{
				  //  StringBuilder line = new StringBuilder();
				    //for (lint i = 0; i < data.length; i++) {
				      //  line.append(data[i]);
				        //if (i != data.length - 1) {
				          //  line.append(',');
				        //}
				    //}
				    //line.append("\n");
				    //depthAndNames.write(line.toString());
				//}
				//depthAndNames.close();
				

		}

}
