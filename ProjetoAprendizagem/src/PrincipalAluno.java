import java.util.Scanner;

public class PrincipalAluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        Usuario user = new Usuario();

        System.out.print("Digite seu Nome: ");
        aluno.setNome(sc.nextLine());
        user.setNome(aluno.getNome());

        System.out.print("Digite sua turma: ");
        aluno.setTurma(sc.nextLine());
        user.setTurma(aluno.getTurma());

        System.out.print("Digite sua matrícula: ");
        aluno.setMatricula(sc.nextLine());

        System.out.print("Digite CPF ou Email: ");
        user.setCpfOuEmail(sc.nextLine());

        String senha;

        do {
            System.out.print("Digite a senha de acesso: ");
            senha = sc.nextLine();

            if (!senha.equals("senai@2025")) {
                System.out.println("Senha incorreta, tente novamente!");
            }

        } while (!senha.equals("senai@2025"));

        System.out.println("\nAcesso liberado!\n");

      
        System.out.print("Quantas faltas você teve no ano? ");
        int faltasAno = sc.nextInt();
      

        aluno.settotalFaltas(faltasAno);

      
        while (true) {

            System.out.println("\n1 = Justificar Falta");
            System.out.println("2 = Consultar Presença");
            System.out.println("0 = Sair");
            System.out.print("Escolha: ");

            int pagina = sc.nextInt();
            sc.nextLine();

            switch (pagina) {

                case 1:
                    System.out.print("\nDigite a justificativa da falta: ");
                    String justificativa = sc.nextLine();

                    Falta falta = new Falta();
                    falta.setMotivo(justificativa);
                    falta.setData("Hoje");

                    aluno.adicionarFalta(falta);

                    System.out.println("\nJustificativa registrada com sucesso!\n");
                    aluno.mostrarFaltas();
                    break;

                case 2:
                    System.out.println("\nLISTA DE PRESENÇA");

                    System.out.print("Ambires está presente? (sim/nao): ");
                    String resposta = sc.nextLine().toLowerCase();

                    boolean ambiresPresente = resposta.equals("sim");

                    if (ambiresPresente) {
                        System.out.println("Ambires está presente!");
                    } else {
                        System.out.println("Ambires está ausente.");
                    }
                    break;

                case 0:
                    System.out.println("\nSaindo...\n");
                    System.out.println("===== RESUMO DO ALUNO =====");
                    aluno.mostrarAluno();
                    return;

                default:
                    System.out.println("\nOpção inválida, tente novamente!");
            }
        }
    }
}
