package CriarExercicio;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CriarExercicio {

    public static void main(String[] args) {
        String baseSrc = "src";
        File srcDir = new File(baseSrc);
        File[] arquivos = srcDir.listFiles();
        int maiorNumero = 0;

        if (arquivos != null) {
            Pattern pattern = Pattern.compile("Ex0*(\\d+)");
            for (File file : arquivos) {
                if (file.isDirectory()) {
                    Matcher matcher = pattern.matcher(file.getName());
                    if (matcher.matches()) {
                        int numero = Integer.parseInt(matcher.group(1));
                        if (numero > maiorNumero) {
                            maiorNumero = numero;
                        }
                    }
                }
            }
        }

        int proximoNumero = maiorNumero + 1;
        String nomeEx = String.format("Ex%03d", proximoNumero);
        String caminhoPacote = baseSrc + "/" + nomeEx;
        File novaPasta = new File(caminhoPacote);

        if (novaPasta.mkdirs()) {
            System.out.println("Criado: " + caminhoPacote);
        } else {
            System.out.println("Falha ao criar a pasta (já existe?).");
            return;
        }

        String arquivoJava = caminhoPacote + "/Main.java";
        String conteudo = """
                package  """ + " " + nomeEx + ";" +"""

                import java.util.Scanner;

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Teste");
                        sc.close();
                    }
                }
                """;

        try (FileWriter writer = new FileWriter(arquivoJava)) {
            writer.write(conteudo);
            System.out.println("Arquivo Main.java criado com sucesso em " + arquivoJava);
        } catch (IOException e) {
            System.err.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
    }
}
