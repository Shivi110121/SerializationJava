package csvTableProject;


//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;

public class SeaCreaturesCSV 
{
    private String seaCreatureName;
    private int depth;

    public SeaCreaturesCSV(String seaCreatureName, int depth) {
        this.seaCreatureName = seaCreatureName;
        this.depth = depth;
    }

    public SeaCreaturesCSV() {
        this.seaCreatureName = "Killer Whale";
        this.depth = 328;
    }

    public void setSeaCreatureName(String seaCreatureName) {
        this.seaCreatureName = seaCreatureName;
    }

    public String getSeaCreatureName() {
        return seaCreatureName;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    public int getDepth() {
        return depth;
    }


public static void main(String[] args) 
{
    	SeaCreaturesCSV  creature1 = new SeaCreaturesCSV("Killer Whale", 328);
}

}


