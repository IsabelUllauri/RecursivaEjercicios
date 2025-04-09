public class App {
    public static void main(String[] args) throws Exception {

        int resSuma= SumaDeNumerosConsecutivos.sumaNC(5);
        System.out.println("suma de nuemros del 1-5: "+ resSuma);

        int resPotencia= PotenciaDeNumero.Potencia(2,3);
        System.out.println("n1 elevado a n2: "+resPotencia);

        int resSumaDigitos= SumaDeDigitosNumero.sumaDN(1234);
        System.out.println("suma de los digitos: "+resSumaDigitos);
        System.out.println("\n sout");

    }
}
