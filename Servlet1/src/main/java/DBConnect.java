
import java.util.*;
import java.sql.*;

public class DBConnect {
    public void insertStudente(Studente s) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Servlet1","root","admin");
            ps=con.prepareStatement("Insert into studente(nome, cognome, email, password) values(?,?,?,?)");
            ps.setString(1,s.getNome());
            ps.setString(2, s.getCognome());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getPassword());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("insert studente " + e.getMessage());
            throw new SQLException("Insert studente " + e.getMessage());
        }
        catch (ClassNotFoundException e) {
            System.out.println("insert studente " + e.getMessage());
            throw new ClassCastException("insert studente: "+ e.getMessage());
        }
        finally {
            closeConnection(con, null, ps);
        }
    }
    public void closeConnection(Connection con, ResultSet rs, PreparedStatement ps) throws SQLException{
        try{

            if(ps!= null) {
                ps.close();
            }
            if(rs != null) {
                rs.close();
            }
            if(con!= null) {
                con.close();
            }
        }catch(SQLException e){
            System.out.println("close connection " + e.getMessage());
            throw new SQLException("Connessione fallita");
        }
    }
}
