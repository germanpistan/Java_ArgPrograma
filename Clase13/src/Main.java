import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conexion a MySql");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/alumnos",
                    "root",
                    "apolo1911"
            );
            Statement st =con.createStatement();

            /*st.executeUpdate("insert into alumno values " +
                    "(1003, 'Hernan', 'Mattio','2000-02-02', 39458741,1)");  COMO INSERTAR REGISTROS EN LA BD*/

            /*st.executeUpdate("update alumno set nombre = 'Hernan Carlos' where legajo = 1003"); COMO MODIFICAR REGISTRO*/
            /*ResultSet rs = st.executeQuery("select * from alumno where dni > 40000000 order by dni asc");  //hacer una consulta e imprimir datos en consola
            */
            ResultSet rs = st.executeQuery("select * from alumno where year (fechanacimiento) > 2000 order by dni asc");
            /*while (rs.next()) {

                System.out.println("Alumno " + rs.getInt(1) + " con DNI" + rs.getInt(5));

            }
            con.close();*/

            st.executeUpdate("alter table alumno rename column nombre to nombres");


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}