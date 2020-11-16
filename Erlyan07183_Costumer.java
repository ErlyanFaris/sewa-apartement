package erlyan07183_sewaappartement;
public class Erlyan07183_Costumer {
    String nama,email,notelp,password;
    int indexappart;
    int indexSewa;
    
    public Erlyan07183_Costumer(String nama,String email,String notelp,int indexSewa,int indexappart,String password)
    {
    this.nama=nama;
    this.email=email;
    this.notelp=notelp;
    this.indexSewa=indexSewa;
    this.indexappart=indexappart;
    this.password=password;
    }
    String getEmail()
  {
     return this.email;
  }
    String getNama()
  {
     return this.nama;
  }
  String getNoTelp()
  {
     return this.notelp;
  }
   int getIndexSewa ()
  {
     return indexSewa;
  }
   int getindexappart()
   {
       return indexappart;
   }
   String getpassword()
   {
       return this.password;
   }
}
