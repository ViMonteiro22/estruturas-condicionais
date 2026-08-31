public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        // if idade < 15 categoria infantil
        // if idade >= 15 && idade < 18 categoria juvenil
        // if idade >= 18 categoria adulto

        int idade = 25;
        String categoria;

        /* if (idade < 15){
            System.out.println("Categoria Infantil");
        } else if (idade >=15 && idade <18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        } */

        // código limpo

        if (idade < 15){
            categoria = "Categoria Infantil";
        } else if (idade >=15 && idade <18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}
