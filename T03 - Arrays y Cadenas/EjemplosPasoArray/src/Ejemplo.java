import java.util.Scanner;

public class Ejemplo {
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
        Figura[] array = new Figura[num];
        for( int i = 0; i < num; i++ ) {
            // Vamos reservando uno a uno los elementos del array
            array[i] = new Figura();
            
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
    
    /*private static void leeDatos(Figura[] figs, int i) {
        System.out.printf("Nombre de la figura #%d: ", i+1);
        figs[i].setNombre(sc.nextLine());
        System.out.printf("Lados de la figura #%d: ", i+1);
        figs[i].setLados(sc.nextInt());
        sc.nextLine();
    }*/
    
    private static void leeDatos(Figura fig) {
        System.out.print("Nombre de la figura: ");
        fig.setNombre(sc.nextLine());
        System.out.print("Lados de la figura: ");
        fig.setLados(sc.nextInt());
        sc.nextLine();
    }
    
    private static void muestraFigura(Figura fig) {
        System.out.printf("%s, %d lados\n", fig.getNombre(), fig.getLados());
    }
}
