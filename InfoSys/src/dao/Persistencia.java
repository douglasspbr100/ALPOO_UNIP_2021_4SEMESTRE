package dao;

import java.util.List;

public interface Persistencia <T>{
    public int create (T obj);      //grava
    public T findByCodigo (int id); // retorna somente 1
    public void delete (int id);
    public void update  (T obj);
    public List<T> read ();
}


