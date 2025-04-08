
public class SumaDeNumerosConsecutivos {
    public static int calcular (int n){
        if (n==1){
            return 1;
        } else{
            return n+calcular(n-1);  
               
        }

    }

}