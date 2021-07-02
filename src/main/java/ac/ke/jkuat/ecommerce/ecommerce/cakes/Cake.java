package ac.ke.jkuat.ecommerce.ecommerce.cakes;

public class Cake {
    private Long id;
    private String cakeType;
    private Integer price;
    private String photourl;


    public Cake() {
    }
    

    public Cake(Long id, String cakeType, Integer price, String photourl) {
        this.id = id;
        this.cakeType = cakeType;
        this.price = price;
        this.photourl = photourl;
    }

    public Cake(String cakeType, Integer price, String photourl) {
        this.cakeType = cakeType;
        this.price = price;
        this.photourl = photourl;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCakeType() {
        return this.cakeType;
    }

    public void setCakeType(String cakeType) {
        this.cakeType = cakeType;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getphotourl() {
        return this.photourl;
    }

    public void setphotourl(String photourl) {
        this.photourl = photourl;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cakeType='" + getCakeType() + "'" +
            ", price='" + getPrice() + "'" +
            ", photourl='" + getphotourl() + "'" +
            "}";
    }

}
