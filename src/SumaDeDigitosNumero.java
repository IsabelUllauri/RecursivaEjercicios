public class SumaDeDigitosNumero {
   
   
    public static int calcular (int numero){
        if (numero <10) {
            return numero;
        }else{
            return (numero %10 + calcular(numero/10));
        }
    }
}
