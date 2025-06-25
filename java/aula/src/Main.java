import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setAno(2018);
        carro1.setMarca("Renault");
        carro1.setNome("Sandero");

        Carro carro2 = new Carro();
        carro2.setAno(1985);
        carro2.setMarca("Ford");
        carro2.setNome("Carroça mecânica");

        Carro carro3 = new Carro();
        carro3.setAno(2008);
        carro3.setMarca("Peugeot");
        carro3.setNome("Carro de 2008");

        if (carro1.getAno() == 2018) {
            System.out.println("Este carro é do ano 2018");
        }
        else if (carro3.getAno() == 2018) {
            System.out.println("Este carro é do ano 2018");
        }
        else if (carro3.getAno() == 2008) {
            System.out.println("Este carro não é de 2018 e sim de 2008");
        }
        else if (carro2.getAno() == 2018) {
            System.out.println("Este carro é do ano 2018");
        }
        else if (carro2.getAno() == 1985) {
            System.out.println("Este carro não é de 2018 e sim de 1985");
        }

        //tabela
        Carro [] ListaDeCarro = new Carro  [3];
        ListaDeCarro [0] = carro1;
        ListaDeCarro [1] = carro2;
        ListaDeCarro [2] = carro3;

        int i = 0;

        while (i < 3) {
            System.out.println("Nome...:" + ListaDeCarro[i].getNome());
            i = i + 1;
        }
        for (int i = 0; 1 < ListaDeCarro.length; i++) {
            System.out.println("Nome...:"+ ListaDeCarro[i].getNome()));
        }
    }

}
