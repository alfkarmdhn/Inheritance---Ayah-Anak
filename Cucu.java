
package pewarisanayahanak;

public class Cucu extends Anak{
     String nama="cucu";
     int age = 8;
     
    
    public void Cetak(){
        System.out.println("Cucu ini memiliki sifat "+super.Sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+"tahun");
        System.out.println("dengan tinggi Badan "+super.TB);
        super.hobbi();
    }
}

