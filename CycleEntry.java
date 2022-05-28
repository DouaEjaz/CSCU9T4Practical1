public class CycleEntry extends Entry {
    private String terrain;
    private String tempo;

    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String terr, String temp) {
        super(n, d, m, y, h, min, s, dist);
        terrain = terr;
        tempo = temp;
    }//constructor

    public String getTerrain() {
        return terrain;
    } //getTerrain

    public String getTempo() {
        return tempo;
    } //getTempo

    public String getSwimEntry () {
        String result = getName()+" cycled " + getDistance() + " km in " + getHour() +":"+getMin()+":"+ getSec() + " on " +getDay()+"/"+getMonth()+"/"+getYear()+ "on " +getTerrain()+  " at " +getTempo() + " tempo"+ "\n";
        return result;
    } //getEntry
}