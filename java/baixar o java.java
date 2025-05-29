baixar o java
x64 Compressed Archive	185.97 MB	
https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.zip (sha256)
x64 Installer	164.35 MB	
https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe (sha256)
x64 MSI Installer	163.09 MB	
https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.msi (sha256)

ver se o java está rodando
 java --version

baixar o IntelliJ 
https://www.jetbrains.com/pt-br/idea/download/?section=windows#

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Somando...
        Main main = new Main();
        int sum = main.sum(20,24 );
        System.out.println(sum);

        //Pitágoras
        double pitagoras = main.pitagoras( 4, 3);
        System.out.println(pitagoras);

        //Exibição de nome
        String nomeCompleto = main.nomeCompleto("Rafael", "Alves");
        System.out.println(nomeCompleto);
    }

    public int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    public double pitagoras(double b, double c) {
        double a = b * b + c * c;
        double result = Math.sqrt(a);
        return result;
    }

    public String nomeCompleto (String nome, String sobrenome) {
        String nomeMeio = "Hlaki";
        return nome + " " + nomeMeio + " " + sobrenome;
    }

}
