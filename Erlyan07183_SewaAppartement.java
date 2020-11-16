package erlyan07183_sewaappartement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Erlyan07183_SewaAppartement {
static ArrayList <Erlyan07183_Sewa> datasewa=new ArrayList();
static ArrayList <Erlyan07183_Costumer> datapelanggan=new ArrayList();
static Scanner input=new Scanner(System.in);
public static void main(String[] args) {
System.out.println("Selamat Datang Di Sewa Appartement !!");
        int pil;
        Listsewa();
        do
        {
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pil=input.nextInt();
            switch(pil)
            {
                case 1 :
                    daftar();
                    break;
                case 2 : 
                    System.out.print("EMAIL = ");
                    String email= input.next();
                    System.out.print("PASSWORD = ");
                    String password= input.next();
                    view(email,password);
                    break;
                case 3 :
                    delete();
                    break;
                case 4 :
                    update();
                    break;
                
            }
        }while(pil!=5);
    }
static void daftar()
    {
        System.out.print("Input NAMA = ");
        String nama=input.next();
        System.out.print("Input PASSWORD = ");
        String password=input.next();
        System.out.print("Input EMAIL = ");
        String email=input.next();
        System.out.print("Input NoTelp = ");
        String notelp=input.next();
        System.out.print("Input Tanggal Booking(dd/mm/yyyy) = ");
        Date tanggal = new Date(input.next());
        //System.out.print("Kelas = ");
        //String kelas=input.next();
        for(int i=0;i<datasewa.size();i++) 
        {
            System.out.println(i+"."+datasewa.get(i).unit);
        }
        System.out.print("Pilih SEWA = ");
        int indexsewa=input.nextInt();
        for(int i=0;i<Erlyan07183_appart.appart.length;i++){
        System.out.println(i+"."+Erlyan07183_appart.appart[i]);     
        }
        System.out.print("Pilih Appartement = ");
        int indexappart=input.nextInt();
        datapelanggan.add(new Erlyan07183_Costumer(nama,email,notelp,indexsewa,indexappart,password));
        }
    static void view(String email, String password)
    {
            for(int i=0;i<datapelanggan.size();i++)
            {
                if(email.equals(datapelanggan.get(i).getEmail())&&password.equals(datapelanggan.get(i).getpassword()))
                {
                    System.out.println("Nama = "+datapelanggan.get(i).getNama());
                    System.out.println("Tanggal Booking = "+new SimpleDateFormat("dd-MM-yyyy").format(datasewa.get(i).getDate()));
                    System.out.println("No Telp = "+datapelanggan.get(i).getNoTelp());
                    System.out.println("Unit = "+datasewa.get(datapelanggan.get(i).indexappart).getunit());
                    System.out.println("Waktu = "+datasewa.get(datapelanggan.get(i).indexappart).getwaktu());
                    System.out.println("Harga = "+datasewa.get(datapelanggan.get(i).indexappart).getharga());
                    System.out.println("Appartement = "+Erlyan07183_appart.appart[datapelanggan.get(i).indexappart]);                                       
               }
                else
                {
                    System.out.println("nama atau pasword salah");
                }
            }
            
    }
    static void update(){
                System.out.println("index ke ");
                int index = input.nextInt();
                System.out.print("Input NAMA = ");
                String nama=input.next();
                System.out.print("Input PASSWORD = ");
                String password=input.next();
                System.out.print("Input EMAIL = ");
                String email=input.next();
                System.out.print("Input NoTelp = ");
                String notelp=input.next();
                System.out.print("Input Tanggal Booking(dd/mm/yyyy) = ");
                Date tanggal = new Date(input.next());
                //System.out.print("Kelas = ");
                //String kelas=input.next();
                for(int i=0;i<datasewa.size();i++) 
                {
                    System.out.println(i+"."+datasewa.get(i).unit);
                }
                System.out.print("Pilih SEWA = ");
                int indexsewa=input.nextInt();
                for(int i=0;i<Erlyan07183_appart.appart.length;i++){
                System.out.println(i+"."+Erlyan07183_appart.appart[i]);     
                }
                System.out.print("Pilih Appartement = ");
                int indexappart=input.nextInt();
                datapelanggan.set(index, new Erlyan07183_Costumer(nama,email,notelp,indexsewa,indexappart,password));
            }
            static void delete(){
                System.out.println("index ke ");
                int index = input.nextInt();
                datapelanggan.remove(index);
            }
    static void Listsewa()
    {
        String nopilsewa[]={"01","02","03"};
        String unitsewa[]={"singgel bed","twin bed","king bed"};        
        String waktusewa[]={"3 jam","6 jam","12 jam","24 jam","midnight"};
        String hargasewa[]={"90k","150k","200k","250k","180k"};        
        String notelpsewa[]={"01","02","03","04","05","06","07"};        
        String tglbooking[]={"04/05/2000","01/12/2000","03/3/2000","23/6/2000","11/3/2000","13/9/2000","22/12/2000"};
    
        for(int i=0;i<nopilsewa.length;i++)
        {
            datasewa.add(new Erlyan07183_Sewa(unitsewa[i],waktusewa[i],hargasewa[i],notelpsewa[i],nopilsewa[i],new Date(tglbooking[i])));
        }
    }
}
    

