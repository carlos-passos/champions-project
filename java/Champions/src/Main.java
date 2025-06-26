public class Main {

    public static void main(String[] args) {

        League Liga1 = new League();
        Liga1.setNome("Champions League");
        Liga1.setFormato("Fase de grupos e mata mata");
        Liga1.setRodadas(17);

        League Liga2 = new League();
        Liga2.setNome("Brasileirão");
        Liga2.setFormato("Liga");
        Liga2.setRodadas(36);

        League Liga3 = new League();
        Liga3.setNome("Premier League");
        Liga3.setFormato("Liga");
        Liga3.setRodadas(38);

        League[] ListaDeLigas = { Liga1, Liga2, Liga3 };

        for (int i = 0; i < ListaDeLigas.length; i++) {
            System.out.println("Nome...: " + ListaDeLigas[i].getNome());
        }

        //------------------------------------------------------------------------------------------

        Team Time1 = new Team();
        Time1.setNome("Real Madrid");
        Time1.setTitulos(17);

        Team Time2 = new Team();
        Time2.setNome("Corinthians");
        Time2.setTitulos(7);

        Team Time3 = new Team();
        Time3.setNome("Liverpool");
        Time3.setTitulos(2);

        Team[] ListaDeTimes = { Time1, Time2, Time3 };

        for (int i = 0; i < ListaDeTimes.length; i++) {
            System.out.println("Nome...: " + ListaDeTimes[i].getNome());
        }
    }
}
