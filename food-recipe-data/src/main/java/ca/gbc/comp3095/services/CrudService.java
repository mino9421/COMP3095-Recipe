package ca.gbc.comp3095.services;
import java.util.List;
public interface CrudService<T, ID> {

    // common methods bellow
    T findById(ID id);
    T save(T object);

    List<T> findAll();

    void delete(T object);
    void deleteById(ID id);
}
