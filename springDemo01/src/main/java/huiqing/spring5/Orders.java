package huiqing.spring5;

public class Orders {
    private String oname;
    private String oaddress;

    public Orders(String oname, String oaddress) {
        this.oname = oname;
        this.oaddress = oaddress;
    }

    public String getOname() {
        return oname;
    }

    public String getOaddress() {
        return oaddress;
    }
}
