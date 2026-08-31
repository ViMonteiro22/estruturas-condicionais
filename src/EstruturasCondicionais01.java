
public class EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // if (idade >= 18) Tem essa possibilidade

        if (isAutorizadoComprarBebida) {
            System.out.println("Você pode comprar bebida alcoólica!");
        } else {
            System.out.println("Você não pode comprar bebida alcoólica!");
        }

        // ! (NEGAÇÃO)

        if (!isAutorizadoComprarBebida) {
            System.out.println("Você não pode comprar bebida alcoólica!");
        }
    }
}