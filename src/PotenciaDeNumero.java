public class PotenciaDeNumero {
    
    public static int Potencia ( int base, int exponente){
        if (exponente==0){
            return 1;
        }else {
            return base * Potencia(base, exponente-1);
        }
        
    }

}
