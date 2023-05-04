import java.util.ArrayList;

public class Librarian extends User {
    
    static ArrayList<Librarian> LibrarianArr = new ArrayList<>(); 

    public Librarian (String UserID ,String UserPassword, String Type , String FirstName , String LastName , String Address , String Email , String cellphone){
        super(UserID , UserPassword , Type , FirstName , LastName , Address , Email , cellphone);
    }

    public void AddBook() {
        
    }

    
    public void RemoveBook() {
        
    }

    
    public static void AddUser(String id , String password , String firstname , String lastname , String address , String cellphone , String email) {
        
        Librarian librariansample = new Librarian(id, password, "Librarian" , firstname, lastname, address, cellphone, email);
        LibrarianArr.add(librariansample);
    }

    
    public void RemoveUser() {
        
    }

    
    public void SearchBooks() {
        
    }

    
    public void SearchMembers() {
        
    }


    public void AddUserOrderList() {
        
    }


    public void RemoveUserOrderList() {
        
    }

    
    public void BlockUser() {
        
    }

    
    public void RentBook() {
        
    }
}
