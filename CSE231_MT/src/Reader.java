import java.util.ArrayList;

public class Reader extends User {

    static ArrayList<Reader> LibrarianArr = new ArrayList<>();

    public Reader (String UserID ,String UserPassword, String Type , String FirstName , String LastName , String Address , String Email , String cellphone){
        super(UserID , UserPassword , Type , FirstName , LastName , Address , Email , cellphone);
    }
    
    public void SearchBooks (){

    }
    public void SearchMembers (){

    }
    public void AddToOrderList (){

    }
    public void RentBook (){

    }

    public static void addReader (String id , String password , String firstname , String lastname , String address , String cellphone , String email){
        Reader Readersample = new Reader(id, password, "Reader" , firstname, lastname, address, cellphone, email);
        LibrarianArr.add(Readersample);

        System.out.println(Readersample.UserID);
    }
}
