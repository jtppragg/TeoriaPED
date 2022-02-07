import java.util.Scanner;

public class EjemploPrimitivo {
    private static final Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos número total de elementos
        System.out.print("Número de figuras: ");        
        int num = sc.nextInt();
        sc.nextLine();
        
        // Creamos el array (vacío)
        int[] array = new int[num];
        //System.out.println(array[0]);
        for( int i = 0; i < num; i++ ) {
            // Vamos reservando uno a uno los elementos del array
            //array[i] = new Figura();
            
            // Y los inicializamos con datos leídos del usuario
            //leeDatos(array, i);
            leeDatos(array[i]);
        }
        
        // Visualizamos el array con for
        for( int i = 0; i < array.length; i++ )
            muestraFigura(array[i]);
        
        // Visualizamos el array con foreach
        /*for( Figura fig : array )
            muestraFigura(fig);*/
    }
    
    /*private static void leeDatos(int[] array, int i) {
        System.out.printf("Lados de la figura #%d: ", i+1);
        array[i] = sc.nextInt();
        sc.nextLine();
    }*/
    
    private static void leeDatos(int fig) {
        System.out.print("Lados de la figura: ");
        fig = sc.nextInt();
        sc.nextLine();
    }
    
    private static void muestraFigura(int fig) {
        System.out.printf("%d lados\n", fig);
    }
}
