
package examen_final;

public void eliminarAnimal(int id) {
    String sql = "DELETE FROM Animales WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, id);
        stmt.executeUpdate();
        System.out.println("Animal eliminado correctamente.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
