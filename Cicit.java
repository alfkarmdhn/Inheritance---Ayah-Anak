
package pewarisanayahanak;

public class Cicit extends Cucu {
     String nama="cicit";
    int age = 4;
    
    public void Cetak(){
        System.out.println("Cicit ini memiliki sifat "+super.Sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+"tahun");
        System.out.println("dengan tinggi Badan "+super.TB);
        super.hobbi();
    }
}
   
