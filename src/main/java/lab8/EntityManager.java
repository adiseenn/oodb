package lab8;

public interface EntityManager {

    void persist(Object obj);
    <T> T merge(T obj);
    void remove(Object obj);
    <T> T find(Class<T> clazz, Object obj);
    <T> T refresh(T obj);

}