package lesson_21;

public class BusDriver {
    private static  int idCounter = 1;
    private final int id;

    private String name;
    private String licenceNumber;

    public BusDriver( String name, String licenceNumber) {
        this.id = idCounter;
        this.name = name;
        this.licenceNumber = licenceNumber;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder("BusDriver : {");
        sb.append("id: ").append(id);
        sb.append(" , name: ").append(name);
        sb.append("}");

        return sb.toString();
    }

    public String getId;

    public String getName() {
        return name;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
}
