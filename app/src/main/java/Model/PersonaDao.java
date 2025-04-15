package Model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PersonaDao {

    @Query("SELECT * FROM persona")
    List<Persona> getTodos();

    @Insert
    void insertTodos(Persona... personas);

    @Delete
    void delete(Persona persona);
}
