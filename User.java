
class User {
    
    private String name;
    private String address;
    private String bloodType;
    
    public User(String inputName , String inputAddress , String inputType ) {
        
        this.name = inputName;
        this.address = inputAddress;
        this.bloodType = inputType; 
        
    }
    
    protected void printUserInfo() {
        
        System.out.println(
                "Name:" + name + "\n" +
                "Address:" + address + "\n" +
                "Blood Type:" + bloodType
                
         );
        
    }
    
    
}