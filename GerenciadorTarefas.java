import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de gerenciamento de tarefas LEGADO!");
        System.out.println("Este código não usa classes e métodos para simular um projeto antigo.");

        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";
        tarefas.add("Estudar para a prova");
        tarefas.add("Lavar a louça");
        tarefas.add("Fazer compras");

        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Listar Tarefas");
            System.out.println("2. Excluir Item");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            entrada = scanner.nextLine();

            if (entrada.equals("1")) {
                System.out.println("\n--- Lista de Tarefas ---");
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                }

            } else if (entrada.equals("2")) {
                if (tarefas.isEmpty()) {
                    System.out.println("Não há tarefas para excluir.");
                } else {
                    System.out.println("\n--- Excluir Tarefa ---");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }

                    System.out.print("Digite o número da tarefa que deseja excluir: ");
                    try {
                        int num = Integer.parseInt(scanner.nextLine());
                        if (num >= 1 && num <= tarefas.size()) {
                            String removida = tarefas.remove(num - 1);
                            System.out.println("Item \"" + removida + "\" excluido com sucesso.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada invalida. Use um número.");
                    }
                }

            } else if (entrada.equals("3")) {
                System.out.println("Saindo do programa. Até mais!");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
