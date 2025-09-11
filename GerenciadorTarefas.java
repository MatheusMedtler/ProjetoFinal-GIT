import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de gerenciamento de tarefas LEGADO!");
        System.out.println("Este código não usa classes e métodos para simular um projeto antigo.");

        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        tarefas.add("Limpar a casa");
        tarefas.add("Lavar a roupa");

        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Listar Tarefas");
            System.out.println("2. Detalhes das tarefas");
            System.out.println("3. Criar Tarefa");
            System.out.println("4. Sair");
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
                    System.out.println("Nenhuma tarefa cadastrada para mostrar detalhes.");
                } else {
                    System.out.print("Digite o número da tarefa: ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine()) - 1;
                        if (indice >= 0 && indice < tarefas.size()) {
                            String tarefa = tarefas.get(indice);
                            System.out.println("\n--- Detalhes da Tarefa ---");
                            System.out.println("Número: " + (indice + 1));
                            System.out.println("Descrição: " + tarefa);
                            System.out.println("Status: Pendente");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida.");
                    }
                }
            } else if (entrada.equals("3")) {
                System.out.println("Digite uma tarefa:");
                String addTarefa = scanner.nextLine();
                System.out.println("Tarefa cadastrada com success:");
                tarefas.add(addTarefa);
            } else if (entrada.equals("4")) {
                System.out.println("Saindo do programa. Até mais!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
