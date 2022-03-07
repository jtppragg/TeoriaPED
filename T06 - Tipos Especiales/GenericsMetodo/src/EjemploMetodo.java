public class EjemploMetodo {

    public static void main( String[] args ) {
        Integer[] arrayInt = {1, 2, 3};
        Float[] arrayFloat = {1.1f, 2.2f, 3.3f};
        Double[] arrayDouble = {1.2, 2.1, 3.3};
        String[] arrayString = {"hola", "prueba", "de", "generics"};

        visualizaInt(arrayInt);
        visualizaFloat(arrayFloat);

        visualiza(arrayInt);
        visualiza(arrayFloat);
        visualiza(arrayDouble);
        visualiza(arrayString);
    }

    public static void visualizaInt(Integer[] array) {
        for( Integer num : array )
            System.out.println(num);
    }

    public static void visualizaFloat(Float[] array) {
        for( Float num : array )
            System.out.println(num);
    }

    public static <Tipo> void visualiza(Tipo[] array) {
        for( Tipo num : array )
            System.out.println(num);
    }

}
