
package examen_final;

import java.sql.ResultSet;
import java.sql.Statement;

public void listarAnimales() {
    String sql = "SELECT * FROM Animales";

    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String fechaNacimiento = rs.getString("fechaNacimiento");
            String especie = rs.getString("especie");
            System.out.printf("ID: %d, Nombre: %s, Fecha de Nacimiento: %s, Especie: %s%n",
                               id, nombre, fechaNacimiento, especie);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
