public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro livro2 = new Livro("O Alquimista", "Paulo Coelho", 208);

        System.out.println("=== CADASTRO DE LIVROS ===");
        livro1.exibirInfo();
        System.out.println("----------------");
        livro2.exibirInfo();
    }
}