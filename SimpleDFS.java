package varsha;

import java.util.*;

public class SimpleDFS {

    private Map<String, List<String>> homeMap = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    public void addRoom(String room, String connectedRoom) {
        homeMap.putIfAbsent(room, new ArrayList<>());
        homeMap.putIfAbsent(connectedRoom, new ArrayList<>());
        homeMap.get(room).add(connectedRoom);
        homeMap.get(connectedRoom).add(room);
    }

    public void dfs(String startRoom) {
        visited.clear(); 
        System.out.println("Starting DFS from: " + startRoom);
        dfsHelper(startRoom);
    }

    private void dfsHelper(String room) {
        if (visited.contains(room)) return;

        visited.add(room);
        System.out.println("Visited: " + room);

        for (String neighbor : homeMap.getOrDefault(room, new ArrayList<>())) {
            dfsHelper(neighbor);
        }
    }

    public static void main(String[] args) {
        SimpleDFS home = new SimpleDFS();

        home.addRoom("Living Room", "Kitchen");
        home.addRoom("Living Room", "Bedroom");
        home.addRoom("Kitchen", "Bathroom");
        home.addRoom("Bedroom", "Balcony");

     
        home.dfs("Living Room");
    }
}
