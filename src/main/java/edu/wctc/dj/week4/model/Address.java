
package edu.wctc.dj.week4.model;

public final class Address {
    
    private String street;
    private String city;
    private String state;
    private String zip;
    
    ////////////////////////////////////////
    // ---------- CONSTRUCTORS ---------- //
    ////////////////////////////////////////

    public Address(String street, String city, String state, String zip) {
        setStreet(street);
        setCity(city);
        setState(state);
        setZip(zip);
    }

    ////////////////////////////////////////
    // ------ INTERACTABLE METHODS ------ //
    ////////////////////////////////////////
    
    ////////////////////////////////////////
    // --------- SETTER METHODS --------- //
    ////////////////////////////////////////
    
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    ////////////////////////////////////////
    // --------- GETTER METHODS --------- //
    ////////////////////////////////////////    
    
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
    
    ////////////////////////////////////////
    // ----- PRIVATE HELPER METHODS ----- //
    ////////////////////////////////////////
    
    ////////////////////////////////////////
    // --------- OTHER METHOID ---------- //
    ////////////////////////////////////////

   

    
}
