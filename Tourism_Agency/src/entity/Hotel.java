package entity;

public class Hotel {
private int id ;
private String name;
private String city;
private String region;
private String adress;
private String mail;
private String phone;
private int star;
private boolean park;
private boolean wifi;
private boolean pool;
private boolean fitness;
private boolean concierge;
private boolean spa;
private boolean room_service;

public Hotel(){
}
    public Hotel(int id, String name, String city, String region, String adress, String mail, String phone, int star, boolean park, boolean wifi, boolean pool, boolean fitness, boolean concierge, boolean spa, boolean room_service) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.region = region;
        this.adress = adress;
        this.mail = mail;
        this.phone = phone;
        this.star = star;
        this.park = park;
        this.wifi = wifi;
        this.pool = pool;
        this.fitness = fitness;
        this.concierge = concierge;
        this.spa = spa;
        this.room_service = room_service;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public boolean isPark() {
        return park;
    }

    public void setPark(boolean park) {
        this.park = park;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isFitness() {
        return fitness;
    }

    public void setFitness(boolean fitness) {
        this.fitness = fitness;
    }

    public boolean isConcierge() {
        return concierge;
    }

    public void setConcierge(boolean concierge) {
        this.concierge = concierge;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isRoom_service() {
        return room_service;
    }

    public void setRoom_service(boolean room_service) {
        this.room_service = room_service;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", adress='" + adress + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", star=" + star +
                ", park=" + park +
                ", wifi=" + wifi +
                ", pool=" + pool +
                ", fitness=" + fitness +
                ", concierge=" + concierge +
                ", spa=" + spa +
                ", room_service=" + room_service +
                '}';
    }
}
