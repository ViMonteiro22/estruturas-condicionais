public class EstruturasCondicionais03 {
    public static void main(String[] args) {

        // Doar se o salario for maior que 5000

        double salario = 5000;
        String mensagemDoar = "Vou doar 500 pro DevDojo, pois ele merece";
        String mensagemNaoDoar = "Não consigo doar ainda, preciso virar engenheira de software";

        // (condicao) ? verdadeiro : falso
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;


        /* String resultado;

        if (salario > 5000){
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }*/

        System.out.println(resultado);
    }
}
