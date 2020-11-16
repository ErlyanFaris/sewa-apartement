package erlyan07183_sewaappartement;
import java.util.Date;
public class Erlyan07183_Sewa {
            String unit,waktu,harga,notelp,nopil;
    Date Tanggalbooking;
public Erlyan07183_Sewa(String unit,String waktu,String harga,String notelp,String nopil,Date Tanggalbooking)
{
    this.nopil=nopil;
    this.unit=unit;
    this.waktu=waktu;
    this.harga=harga;
    this.notelp=notelp;
    this.Tanggalbooking=Tanggalbooking;
}
String getnopil()
{
    return this.nopil;
}
 String getunit()
 {
     return this.unit;
 }
 String getwaktu()
 {
     return this.waktu;
 }
 String getharga()
 {
     return this.harga;
 }
 String getNoTelp()
 {
     return this.notelp;
 }
 Date getDate()
 {
     return this.Tanggalbooking;
 }
}
