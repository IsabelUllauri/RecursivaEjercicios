public class App {
    public static void main(String[] args) throws Exception {

        int resSuma= SumaDeNumerosConsecutivos.calcular(5);
        System.out.println("suma de nuemros del 1-5: "+ resSuma);

        int resPotencia= PotenciaDeNumero.calcular(2,3);
        System.out.println("n1 elevado a n2: "+resPotencia);

        int resSumaDigitos= SumaDeDigitosNumero.calcular(1234);
        System.out.println("suma de los digitos: "+resSumaDigitos);

    }
}
