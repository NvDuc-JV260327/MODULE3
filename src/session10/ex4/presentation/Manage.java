package session10.ex4.presentation;

public interface Manage <T> {
    void add(T item);
    void update(int index, T item);
    void delete(int index);
    void display();
}
