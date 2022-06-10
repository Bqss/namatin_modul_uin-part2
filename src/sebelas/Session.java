package sebelas;

public class Session {

    private  static  String usernameId , nama, StatusLogin;

    public static String getUsernameId() {
        return usernameId;
    }

    public static void setUsernameId(String usernameId) {
        Session.usernameId = usernameId;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Session.nama = nama;
    }

    public static String getStatusLogin() {
        return StatusLogin;
    }

    public static void setStatusLogin(String statusLogin) {
        StatusLogin = statusLogin;
    }


}
