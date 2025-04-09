
public class SumaDeNumerosConsecutivos {

    public static int llamadaRecursiva =1;
    public static int sumaNC (int n){
        int idActual=llamadaRecursiva++;

        System.out.println("1. llamada a "+ idActual+ " con numero n= "+n);

        if (n==1){

            System.out.println("llamada a "+ idActual+ "con numero n= "+n+
            "caso base alcanzado n=1");

            return 1;
        } else{
            //return n+sumaNC(n-1); 
            System.out.println("llamada a  "+ idActual+ "Llamando recursivamente con n= "+ (n-1) );


            int resulparcial=sumaNC(n-1);

            int resultado= n+ resulparcial;
            
            System.out.println("llamada a "+ idActual+ "sumando "+n+ " resultado de "+ resulparcial+ "de "+resultado);
            
            System.out.println("llamada a "+ idActual+ " retorno "+resultado);


             return resultado;
               
        }

    }
}