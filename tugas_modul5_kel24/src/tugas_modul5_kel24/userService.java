
package tugas_modul5_kel24;

public class userService {
    private String data[][] = new String[2][3];
    private String histories[][] = new String[2][4];
    private String email, password, roles = "", buku1 ="", buku2 ="", waktu ="";
    
    
    public userService(String emails, String passwords){
        email = emails;
        password = passwords;
        String akun[][] ={
            {"Chairullatifkelompok24@gmail.com","12345","superAdmin"},
            {"Nurhaidahkelompok24@gmail.com","12345","user"}
        };
        String riwayat[][]={
            {"Chairullatifkelompok24@gmail.com","Fisika Dasar","Dasar Pemrograman dan Komputer","26-04-2020"},
            {"Nurhaidahkelompok24@gmail.com","Dasar Pemrograman dan Komputer","Konsep Jaringan Komputer","26-04-2020"}
        };
        this.data=akun;
        this.histories=riwayat;
    }
    private boolean checkCredential(){
        for(int i=0; i<data.length; i++){
            if (email.equals(data[i][0])&&password.equals(data[i][1])){
                roles = data[i][2];
                buku1 = histories[i][1];
                buku2 = histories[i][2];
                waktu = histories[i][3];
                return true;
            }     
        } 
            return false;
    }
    public void login(){
        boolean cek = checkCredential();
        if (cek==true){
            System.out.println("Welcome "+roles);
            System.out.println("Logged it as user email "+email);
            System.out.println(buku1);
            System.out.println(buku2);
            System.out.println("Tangal peminjaman: "+waktu);
        }else{
            System.out.println("Invalid Login");
        }
    }
}
