package Interfaces;
@FunctionalInterface
public interface Creator <T>{
    T create(String name);
}
