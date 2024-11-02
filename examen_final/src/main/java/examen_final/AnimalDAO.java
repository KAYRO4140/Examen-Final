
package examen_final;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnimalDAO {

    public void insertarAnimal(String nombre, String fechaNacimiento, String especie) {
        String sql = "INSERT INTO Animales (nombre, fechaNacimiento, especie) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, fechaNacimiento);
            stmt.setString(3, especie);
            stmt.executeUpdate();
            System.out.println("Animal insertado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

