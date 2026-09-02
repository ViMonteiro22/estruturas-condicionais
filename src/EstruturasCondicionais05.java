public class EstruturasCondicionais05 {
    public static void main(String[] args) {
        char sexo = 'V';

        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

        // Exercício:
        // Utilizando Switch e dados os valores de 1 a 7
        // Imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 5;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Dia Inválido");
                break;
        }
    }
}
