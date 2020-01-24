
/**
 * Punto de entrada a la aplicación
 * 
 * @author - Sara López Vicente
 */
public class AppRevistaJuegosOnLine 
{
    public static void main(String[] args)
    {
        if (args.length != 2) {
           
           System.out.println("Error en argumentos\nSintaxis: java AppRevistaJuegosOnLine <nombre> <n>\n" +
           "------------------------------------------------------------");
        } 
        else{
            //nombre y tam max
            int n = Integer.parseInt(args[1]);
            RevistaOnLineJuegos revista = new RevistaOnLineJuegos(args[0], n);
            
            revista.leerDeFichero();
            
            System.out.println(revista.toString());
            
            System.out.println("***************************************\nPuntuando ...");
            
            revista.puntuar("Planet Zoo", 8);
            revista.puntuar("Steep", 7);
            revista.puntuar("Catastronauts", 9);
            revista.puntuar("Wattam", 9);
            
            System.out.println(revista.toString());
            
            System.out.println("*******************\nJuegos con valoración media > 8.2\n[");
            String[] media = revista.valoracionMayorQue(8.2);
            for (int i = 0; i < media.length; i++) {
                System.out.printf("%s, ");
            }
            System.out.print("]");
            System.out.println("***************************************");
            
            System.out.println("Borrando juegos del género ROL ...");
            System.out.println("Borrados " + revista.borrarDeGenero(Genero.ROL) + " juegos");
            System.out.println(revista.toString());
        }
        
        
    }

}
