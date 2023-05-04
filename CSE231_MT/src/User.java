public class User {

  protected  String UserID , UserPassword , FirstName , LastName , Address , Email , cellphone , Type;
  protected  boolean isBlocked ;

    public User (String UserID ,String UserPassword, String Type , String FirstName , String LastName , String Address , String Email , String cellphone){

        this.UserID=UserID;
        this.UserPassword=UserPassword;
        this.Type=Type;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Address=Address;
        this.Email=Email;
        this.cellphone=cellphone;
    }

    public User (){}

}