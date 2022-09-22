public class User {
    private String username;

    private String password;
    private String name;

    private String fLName;

    private String sLName;

    private String email;

    private String province;


    private Register objectData;

    public User (Register objectData) {   //Con este constructor, llamo al método DataComplete que
        // tiene el conjunto de datos completo Name, Lastname, Number, Id
        //alternativamente: public Adapter(DataComplete datos)  y luego en línea 2 this.objectData=datos
        //Nombre en posición 0, apellido en el 1....
        setUsername (objectData.getCompositeData().split(" ") [0]);
        setPassword (objectData.getCompositeData().split(" ") [1]);
        setName (objectData.getCompositeData().split(" ") [2]);  //el .split va a tomar ese pedazo y separarlo
        setfLName (objectData.getCompositeData().split(" ") [3]);
        setsLName (objectData.getCompositeData().split(" ") [4]);
        setEmail (objectData.getCompositeData().split(" ") [5]);
        setProvince (objectData.getCompositeData().split(" ") [6]);
    }

    public User (String username, String password, String name, String fLName, String sLName, String email, String province){
        this.username = username;
        this.password = password;
        this.name = name;
        this.fLName = fLName;
        this.sLName = sLName;
        this.email= email;
        this.province=province;
    }

    public String getUsername() {
        return username;
        }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name;
    }


    public String getfLName() {
        return fLName;
    }

    public void setfLName (String fLName) {
        this.fLName = fLName;
    }

    public String getsLName() {
        return sLName;
    }

    public void setsLName(String sLName) {
        this.sLName = sLName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province; }
}