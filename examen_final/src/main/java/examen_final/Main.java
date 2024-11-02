
package examen_final;

public class Main {
    public static void main(String[] args) {
        AnimalDAO animalDAO = new AnimalDAO();

        // Insertar un animal
        animalDAO.insertarAnimal("León", "2018-05-12", "Felino");

        // Listar animales
        animalDAO.listarAnimales();

        // Actualizar un animal
        animalDAO.actualizarAnimal(1, "León Africano", "2018-05-12", "Felino");

        // Eliminar un animal
        animalDAO.eliminarAnimal(1);
    }
}

