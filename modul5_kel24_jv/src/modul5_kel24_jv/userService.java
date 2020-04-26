
package modul5_kel24_jv;

public class userService {
    private String[][] data = new String[2][3];
    private String email, password, roles = "";
    
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"Chairullatifkelompok24@gmail.com", "12345", "superAdmin"},
            {"Nurhaidahkelompok24@gmail.com", "12345", "user"} 
        };
        this.data = data;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}
