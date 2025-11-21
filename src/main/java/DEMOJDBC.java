import java.sql.*;
public class DEMOJDBC {

    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver"); // this how you load the driver

        // getting a connection mean logining into the dbms which in my case is postgress
        String user = "jdbc:postgresql://localhost:5432/Library"; // follow three steps what DBMS is the java connecting to then what is the name of the database
        String uname = "postgres";
        String pass = "Ayomikun12!";

        Connection con = DriverManager.getConnection(user,uname,pass);
        Statement st = con.createStatement();
        Statement updating = con.createStatement();

     //  ResultSet rs=  st.executeQuery("select library_name from the_library_tab where id_library = 0");


    //   String name = rs.getString("library_name");

     //   System.out.println(name);


        boolean daniel =updating.execute("update final_library set library_name = 'the swanley ' where library_name = 'swanley'");
        ResultSet all_data = st.executeQuery("select * from final_library ");

        while (all_data.next()){
            System.out.print(all_data.getString("library_name"));
            System.out.print(  " library has a max capacity of "+ all_data.getInt("library_max_book_capacity"));
            System.out.println( " but currently has a current capacity of  "+ all_data.getInt("library_current_book_capacity")+ " stored inside the library now ");
        }


con.close();

    }
}
