package javatpoint;

class Address {
    String city,state,country;

    public Address(String city, String state , String country){
        this.city = city ;
        this.state = state;
        this.country = country;
    }
}
public class Emp{
    int id;
    String name;
    Address ad;

    public Emp(int id , String name , Address ad){
        this.id = id;
        this.ad = ad;
        this.name = name;
    }
    void display(){
        System.out.println(id+" "+name+","+ad.city+","+ad.state+","+ad.country);
    }

    public static void main(String[] args) {
        Address ad1 = new Address("Nagpur" , "Maharashtra", "INDIA");
        Address ad2 = new Address("Indore","Madhya Pradesh","INDIA");

        Emp emp1 = new Emp(15,"Tejas",ad1);
        Emp emp2 = new Emp(16,"Tanmay",ad2);

        emp1.display();
        emp2.display();
    }


}
