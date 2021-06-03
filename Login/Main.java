package Login;

public class Main {
    public static void main(String[] args) {
        idpass idpass = new idpass();

        

        loginpage loginpage = new loginpage(idpass.getLoginInfo());
    }
}
