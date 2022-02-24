
package pbo_bola;

public class PBO_BOLA {
    private double JariJari;
    
    public double setJariJari (double jari){
        return this.JariJari=jari;
    }
    public double showDiameter(){
        return JariJari*2;
    }
    public double showLuasPermukaan(){
        return 4*Math.PI*Math.pow(JariJari, 2);
    }
    public double showVolume(){
        return Math.PI*Math.pow(JariJari, 3);
    }
    public void cetak(){
        System.out.println("Diameter\t:"+showDiameter() +
        "\nLuas Permukaan\t:"+showLuasPermukaan()+
        "\nVolume\t:"+showVolume());
    }
}
    

