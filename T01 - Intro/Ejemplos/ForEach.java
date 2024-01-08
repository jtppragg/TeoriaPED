public class ForEach {
	public static void main(String[] args) {
		System.out.println("Usando for:");
		for( int i = 0; i < args.length; i++ )
			System.out.println(i + ": " + args[i]);

		System.out.println("\nUsando foreach:");
		for( String arg : args )
			System.out.println(arg);
	}
}
