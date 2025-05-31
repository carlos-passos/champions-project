public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Somando...
        Main main = new Main();
        int sum = main.sum(20,24 );
        System.out.println(sum);

        //Subtraindo
        int min = main.min( 38, 17);
        System.out.println(min);

        //Divisão
        int div = main.div( 38, 17);
        System.out.println(div);

        //Pitágoras
        double pitagoras = main.pitagoras( 4, 3);
        System.out.println(pitagoras);

        //Exibição de nome
        String nomeCompleto = main.nomeCompleto("Rafael", "Alves");
        System.out.println(nomeCompleto);

        //Idade
        int id = main.id(17);
        System.out.println(id);
        //CPF
        int cpf = main.cpf(111676809);
        System.out.println(cpf);
    }
//soma
    public int sum(int x, int y) {
        int result = x + y;
        return result;
    }
//subtração
    public int min(int x, int y) {
        int result = x - y;
        return result;
    }
//divisão
    public int div(int x, int y) {
        int result = x / y;
        return result;
    }
    public double pitagoras(double b, double c) {
        double a = b * b + c * c;
        double result = Math.sqrt(a);
        return result;
    }
//nome
    public String nomeCompleto (String nome, String sobrenome) {
        String nomeMeio = "Hlaki";
        return nome + " " + nomeMeio + " " + sobrenome;
    }
//idade
    public int id(int idade) {
        return idade;
    }
//CPF
    public int cpf(int cpf) {
        return cpf;
    }

}