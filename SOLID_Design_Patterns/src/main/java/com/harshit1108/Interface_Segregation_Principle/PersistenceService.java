package com.harshit1108.Interface_Segregation_Principle;

public interface PersistenceService<T extends Entity> {

    public void save(T entity);

    public void delete(T entity);

    public T findById(Long id);
}
