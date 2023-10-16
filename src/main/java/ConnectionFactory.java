
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static String usuario = "root";
    private static String senha = "anima123";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String bd = "db_managing_life";

    public static Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection(
                    "jdbc://" + host + ":" + porta + "/" + bd + "?user=" + usuario + "&password" + senha + "&useTimezonone=true&serverTimeZone=America/Sao_Paulo" );
            return c;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
