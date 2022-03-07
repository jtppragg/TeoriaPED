public class EjemploObject {
    public static void main(String[] args) {
        ArrayObject arrayString = new ArrayObject();
        arrayString.add("Hola");
        arrayString.add("Prueba");

        ArrayObject arrayAlumno = new ArrayObject();
        arrayAlumno.add(new Alumno("Jon", 20));
        arrayAlumno.add(new Alumno("Jane", 22));
        System.out.printf("Elemento #0: %s\n",
            // Necesario casting para métodos propios
            ((Alumno)arrayAlumno.get(0)).getNombre());

        // Nada impide "mezclar" distintos tipos ...
        arrayAlumno.add("Gorka");
    }
}
