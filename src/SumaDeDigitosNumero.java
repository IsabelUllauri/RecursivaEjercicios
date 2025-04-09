public class SumaDeDigitosNumero {
   
   
    public static int sumaDN (int numero){
        if (numero <10) {
            return numero;
        }else{
            return (numero %10 
            + sumaDN(numero/10));
            
        }
    }
}
