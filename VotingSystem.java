import java.util.HashMap;
import java.util.HashSet;

public class VotingSystem {
    private HashSet<String> voters;
    private HashMap<String, Integer> votes;

    public VotingSystem() {
        this.voters = new HashSet<>();
        this.votes = new HashMap<>();
    }

    public String vote(String voterId, String candidate) {
        if (voters.contains(voterId)) {
            return "Erro: Eleitor já votou.";
        }
        voters.add(voterId);
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        return "Voto registrado para " + candidate + "!";
    }

        public void showResults() {
        System.out.println("Resultados da eleição:");
        for (String candidate : votes.keySet()) {
            System.out.println(candidate + ": " + votes.get(candidate) + " votos");
        }
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        System.out.println(system.vote("123", "Alice"));
        System.out.println(system.vote("123", "Bob"));
        System.out.println(system.vote("456", "Bob"));
        System.out.println(system.vote("789", "Alice"));

        // Exibe os resultados
        system.showResults();
    }
}
