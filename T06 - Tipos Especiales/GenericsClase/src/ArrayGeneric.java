
public class ArrayGeneric<T> implements List<T>{
    private T[] array;
    
    @Override
    public void add( T elemento ) {
        // ...
    }
    
    @Override
    public T get( int posicion ) {
        return array[posicion];
    }
}

