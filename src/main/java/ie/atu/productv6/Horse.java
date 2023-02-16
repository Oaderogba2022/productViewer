package ie.atu.productv6;

public class Horse extends Animal{
    private String dam;
    private String sire;
    private int height;

    public Horse() {
        super();
        dam = "";
        sire = "";
        height = 0;
        count++;

    }

    public Horse(String dam, String sire, int height) {
        this.dam = dam;
        this.sire = sire;
        this.height = height;
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString(){
        return super.toString() + "Horse{" +
                "dam=" + dam + " \'" +
                "sire= '" + sire + "\'" +
                "height= '" + height +
                '}';

    }

}
