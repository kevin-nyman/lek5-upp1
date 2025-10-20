public class Bil
{
    private String märke;
    private String registreringsnummer;
    private String modell;
    private int årsmodell;
    private int hastighet;
    
    public Bil(String märke, String registreringsnummer, String modell,
    int årsmodell)
    {
        if (märke == null || märke.trim().isEmpty() ||
            registreringsnummer == null || registreringsnummer.trim().isEmpty() ||
            modell == null || modell.trim().isEmpty() ||
            årsmodell > 2025 || årsmodell < 1860) {
            throw new IllegalArgumentException("Ogiltiga argument");
        }
        else
        {
            this.märke = märke;
            this.registreringsnummer = registreringsnummer;
            this.modell = modell;
            this.årsmodell = årsmodell;
            this.hastighet = 0;
        }
        
    }
    
    public String getRegistreringsnummer() {
        return this.registreringsnummer;
    }
    
    public String getMärke() {
        return this.märke;
    }
    
    public String getModell() {
        return this.modell;
    }
    
    public int getÅrsmodell() {
        return this.årsmodell;
    }
    
    public int getHastighet() {
        return this.hastighet;
    }
    
    
    public void setModell(String modell) {
        if (modell == null || modell.trim().isEmpty())
        {
            throw new IllegalArgumentException("Ogiltig modell");
        }
        else
        {
            this.modell = modell;
        }
    }
    
    public void ökaHastighet(int x) {
        if (x <= 0)
        {
            throw new IllegalArgumentException("Ogiltig hastighet");
        }
        else
        {
            this.hastighet = x;
            System.out.print("log: hastighet ökad med " + x + "\n");
        }
    }
    
    public void bromsa(int x) {
        if (x <= 0)
        {
            throw new IllegalArgumentException("Ogiltig hastighet");
        }
        else if (x > this.hastighet)
        {
            this.hastighet = 0;
            System.out.print("log: hastighet minskad till 0" + "\n");
        }
        else
        {
            this.hastighet = this.hastighet - x;
            System.out.print("log: hastighet minskad med " + x + "\n");
        }
    }
    
    @Override
    public String toString() {
        return "Bilens information\nMärke: " + this.märke + 
               "\n Modell: " + this.modell + 
               "\n Registreringsnummer: " + this.registreringsnummer + 
               "\n Årsmodell: " + this.årsmodell;
    }

}
