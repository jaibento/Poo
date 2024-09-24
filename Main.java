public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Movie
        Movie movie = new Movie("Shrek Forever", 103, "Shrek Forever Movie Synopsis");

        // Criação de um objeto FamilyClient
        FamilyClient familyClient = new FamilyClient("twopeople", "onepays");

        // Exibindo as informações solicitadas
        System.out.println("Sinopse do filme: " + movie.getSynopsis());
        System.out.println("Duração do filme: " + movie.getDurationInMinutes());
        System.out.println("Número de instâncias: " + familyClient.getInstancesNumber());
        System.out.println("Senha do cliente: " + familyClient.getPassword());
    }
}
