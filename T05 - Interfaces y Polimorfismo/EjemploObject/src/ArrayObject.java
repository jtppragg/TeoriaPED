public class ArrayObject {
    private final Object[] array = new Object[10];
    private int i = 0;

    public void add( Object elemento ) {
        array[i++] = elemento;
    }

    public Object get( int posicion ) {
        return array[posicion];
    }
}
