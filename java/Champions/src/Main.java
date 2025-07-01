import java.util.ArrayList;
import java.util.List;

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

        League[] ligasArray = new League[3];
        ligasArray[0] = Liga1;
        ligasArray[1] = Liga2;
        ligasArray[2] = Liga3;

        List<League> ligasList = new ArrayList<League>();

        for (League l : ligasArray) {
            ligasList.add(l);
        }

        for (League l : ligasArray) {
            System.out.println("Nome...: " + l.getNome());
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

        Team[] timesArray = new Team[3];
        timesArray[0] = Time1;
        timesArray[1] = Time2;
        timesArray[2] = Time3;

        List<Team> timesList = new ArrayList<Team>();

        for (Team t : timesArray) {
            timesList.add(t);
        }

        for (Team t : timesArray) {
            System.out.println("Nome...: " + t.getNome());
        }
}
}
