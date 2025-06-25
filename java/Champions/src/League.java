public class League {
    private String Nome;
    private String Regras;
    private String Formato;
    private int Rodadas;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = Nome;
    }

    public String getRegras() {
        return Regras;
    }

    public void setMarca(String Regras) {
        this.Regras = Regras;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }


    public int getRodadas() {
        return Rodadas;
    }

    public void setRodadas(int Rodadas) {
        this.Rodadas = Rodadas;
    }
}

public class Team{

    private String Nome;
    private String Títulos;

    public String getNome() { return Nome; }

    public void setNome(String Nome) { this.Nome = Nome; }

    public int getTítulos() {
        return Títulos;
    }

    public void setTítulos(int Títulos) {
        this.Títulos = Títulos;
    }
}

