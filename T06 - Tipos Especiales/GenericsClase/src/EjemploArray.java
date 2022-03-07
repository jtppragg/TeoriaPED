public class EjemploArray {

    public static void main(String[] args) {
        ArrayGeneric arrayObject = new ArrayGeneric();
        arrayObject.add(123);
        arrayObject.add(3);
        arrayObject.add("oops!");   // Permite mezclar
        System.out.println( // Casting para trabajar como int
            (Integer)arrayObject.get(0)+1);

        ArrayGeneric<Integer> arrayInt = new ArrayGeneric<>();
        arrayInt.add(123);
        arrayInt.add(3);
        //arrayInt.add("oops!");    // Error
        System.out.println( // No necesario casting
            arrayInt.get(0)+1);
    }

}
