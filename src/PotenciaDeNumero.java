public class PotenciaDeNumero {
    
    public static int calcular ( int base, int exponente){
        if (exponente==0){
            return 1;
        }else {
            return base * calcular(base, exponente-1);
        }
    }

}
