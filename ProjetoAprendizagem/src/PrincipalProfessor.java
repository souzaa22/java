import java.util.Scanner;

public class PrincipalProfessor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        Usuario user = new Usuario();

        System.out.print("Digite seu Nome: ");
        aluno.setNome(sc.nextLine());
        user.setNome(aluno.getNome());

        System.out.print("Digite sua turma (exemplo: 2a): ");
        aluno.setTurma(sc.nextLine());
        user.setTurma(aluno.getTurma());

        System.out.print("Digite seu NIF: ");
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
                    String justificativa = sc.next();

                    Falta falta = new Falta();
                    falta.setMotivo(justificativa);
                    falta.setData("Hoje");

                    aluno.adicionarFalta(falta);

                    System.out.println("\nJustificativa registrada com sucesso!\n");
                    aluno.mostrarFaltas();
                    break;

                case 2:
                    System.out.println("\nCHAMADA");

               
                    System.out.print("Matheus (P = presente | F = faltou | A = atrasado |D = decreto médico): ");
                    String matheus = sc.next().toUpperCase();
                    String relatorio;
                    if (matheus.equals("P")) {
                        System.out.println("Matheus está presente.");
                    } else if (matheus.equals("F")) {
                        System.out.println("Matheus faltou");
                   
                        
                    } else if (matheus.equals("A")) {
                        System.out.println("Matheus chegou atrasado.");
                    }
                   else if (matheus.equals("D")) {
                   System.out.println("Matheus está de decreto médico.");
              }
                    
                     
                    else {
                        System.out.println("Opção inválida para Matheus.");
                    }
                    System.out.println("Deseja ver o relatório do Matheus");
                    
   
                    relatorio = sc.next();
                    
                    if (relatorio.equals("sim")) {
                        System.out.println("Estou doente professora e em breve volto.");
                    }
                  
                    System.out.print("\nGabriel (P = presente | F = faltou | A = atrasado |D = decreto médico): ");
                    String gabriel = sc.next().toUpperCase();

                    if (gabriel.equals("P")) {
                        System.out.println("Gabriel está presente.");
                    } else if (gabriel.equals("F")) {
                        System.out.println("Gabriel faltou.");
                    } else if (gabriel.equals("A")) {
                        System.out.println("Gabriel chegou atrasado.");
                        
                    } 
                    else if (gabriel.equals("D")) {
                        System.out.println("Gabriel está de decreto médico.");
                   }
                    else {
                        System.out.println("Opção inválida para Gabriel.");
                    }
                    System.out.println("Deseja ver o relatório do Gabriel");
                    
                    
                    relatorio = sc.next();
                    
                    if (relatorio.equals("sim")) {
                        System.out.println("Estou doente professora e em breve volto.");
                    }
                    
                    System.out.print("\nRafael (P = presente | F = faltou | A = atrasado |D = decreto médico): ");
                    String rafael = sc.next().toUpperCase();

                    if (rafael.equals("P")) {
                        System.out.println("Rafael está presente.");
                    } else if (rafael.equals("F")) {
                        System.out.println("Rafael faltou.");
                    } else if (rafael.equals("A")) {
                        System.out.println("Rafael chegou atrasado.");
                    } 
                    else if (rafael.equals("D")) {
                        System.out.println("Rafael está de decreto médico.");
                   }
                    else {
                        System.out.println("Opção inválida para Rafael.");
                    }
                    System.out.println("Deseja ver o relatório do Rafael");
                    
                    
                    relatorio = sc.next();
                    
                    if (relatorio.equals("sim")) {
                        System.out.println("Estou doente professora e em breve volto.");
                    }
                 
                    System.out.print("\nAyran (P = presente | F = faltou | A = atrasado |D = decreto médico): ");
                    String ayran = sc.next().toUpperCase();

                    if (ayran.equals("P")) {
                        System.out.println("Ayran está presente.");
                    } else if (ayran.equals("F")) {
                        System.out.println("Ayran faltou.");
                    } else if (ayran.equals("A")) {
                        System.out.println("Ayran chegou atrasado.");
                    } 
                    else if (ayran.equals("D")) {
                        System.out.println("Ayran está de decreto médico.");
                   }
                    else {
                        System.out.println("Opção inválida para Ayran.");
                    }
                    System.out.println("Deseja ver o relatório do Ayran");
                    
                    
                    relatorio = sc.next();
                    
                    if (relatorio.equals("sim")) {
                        System.out.println("Estou doente professora e em breve volto.");
                    }
                    break;

                    
                case 0:
                    System.out.println("\nSaindo...\n");
              
                    return;

                default:
                    System.out.println("\nOpção inválida, tente novamente!");
            }
        }
    }
}
