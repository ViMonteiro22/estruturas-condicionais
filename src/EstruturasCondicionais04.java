public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        // $ 0       $ 34,712  9.70%
        // $ 34,713  $ 68,508  37.35%
        // $ 68,509            49.50%

        double salarioAnual = 35000;
        String porcentagem;

        if (salarioAnual <= 34712){
            porcentagem = "Você vai pagar 9.70% de imposto";
        } else if (salarioAnual >= 34713 && salarioAnual <= 68508) {
            porcentagem = "Você vai pagar 37.35% de imposto";
        } else {
            porcentagem = "Você vai pagar 49.50% de imposto";
        }

        System.out.println(porcentagem);
    }
}
