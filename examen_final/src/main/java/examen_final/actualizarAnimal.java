
package examen_final;

public void actualizarAnimal(int id, String nombre, String fechaNacimiento, String especie) {
    String sql = "UPDATE Animales SET nombre = ?, fechaNacimiento = ?, especie = ? WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, nombre);
        stmt.setString(2, fechaNacimiento);
        stmt.setString(3, especie);
        stmt.setInt(4, id);
        stmt.executeUpdate();
        System.out.println("Animal actualizado correctamente.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

