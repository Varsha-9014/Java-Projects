package varsha;

import java.util.*;

public class DFSTask {
    private Map<String, List<String>> graph = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    public void addBiDirectionalConnection(String zone1, String zone2) {
        graph.putIfAbsent(zone1, new ArrayList<>());
        graph.putIfAbsent(zone2, new ArrayList<>());

        graph.get(zone1).add(zone2);
        graph.get(zone2).add(zone1);
    }

    public void addConnection(String zone, String... connectedZones) {
        graph.putIfAbsent(zone, new ArrayList<>());
        for (String connected : connectedZones) {
            graph.get(zone).add(connected);
        }
    }

    public void printGraph() {
        System.out.println("--- Current Graph ---");
        for (String zone : graph.keySet()) {
            System.out.println(zone + " connects to: " + graph.get(zone));
        }
        System.out.println("---------------------\n");
    }

    public void dfsTraversal(String start) {
        visited.clear();
        if (!graph.containsKey(start)) {
            System.out.println("Error: " + start + " is not in the graph.");
            return;
        }
        System.out.println("DFS Traversal from " + start + ":");
        dfsUtil(start);
        System.out.println();
    }

    private void dfsUtil(String current) {
        if (visited.contains(current)) {
            return;
        }
        System.out.println(current);
        visited.add(current);

        for (String neighbor : graph.getOrDefault(current, Collections.emptyList())) {
            dfsUtil(neighbor);
        }
    }

    public Set<String> findSocialCircle(String startZone) {
        visited.clear();
        Set<String> socialCircle = new HashSet<>();

        if (!graph.containsKey(startZone)) {
            System.out.println("Error: " + startZone + " is not in the graph.");
            return socialCircle;
        }

        findSocialCircleUtil(startZone, socialCircle);
        return socialCircle;
    }

    private void findSocialCircleUtil(String currentZone, Set<String> socialCircle) {
        visited.add(currentZone);
        socialCircle.add(currentZone);

        for (String neighbor : graph.getOrDefault(currentZone, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                findSocialCircleUtil(neighbor, socialCircle);
            }
        }
    }

    public static void main(String[] args) {
        DFSTask socialNetwork = new DFSTask();

        System.out.println("--- Building Social Network Graph ---");
        socialNetwork.addBiDirectionalConnection("Alice", "Bob");
        socialNetwork.addBiDirectionalConnection("Bob", "Charlie");
        socialNetwork.addBiDirectionalConnection("Charlie", "David");

        socialNetwork.addBiDirectionalConnection("Eve", "Frank");

        socialNetwork.addConnection("Grace");

        socialNetwork.printGraph();

        System.out.println("Finding social circle for Alice:");
        Set<String> aliceCircle = socialNetwork.findSocialCircle("Alice");
        System.out.println("Alice's social circle: " + aliceCircle);

        System.out.println("\nFinding social circle for Eve:");
        Set<String> eveCircle = socialNetwork.findSocialCircle("Eve");
        System.out.println("Eve's social circle: " + eveCircle);

        System.out.println("\nFinding social circle for Grace:");
        Set<String> graceCircle = socialNetwork.findSocialCircle("Grace");
        System.out.println("Grace's social circle: " + graceCircle);

        System.out.println("\nFinding social circle for a non-existent person (Xavier):");
        Set<String> xavierCircle = socialNetwork.findSocialCircle("Xavier");
        System.out.println("Xavier's social circle: " + xavierCircle);

        System.out.println("\n--- Demonstrating General DFS Traversal ---");
    }
}