import java.util.*;

class Dijkstra {
    // Function to find the shortest path using Dijkstra's algorithm
    public static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph, String source) {
        // Distance map to store the shortest distance to each vertex
        Map<String, Integer> distances = new HashMap<>();
        for (String vertex : graph.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE); // Initialize all distances to infinity
        }
        distances.put(source, 0); // Distance to the source is 0

        // Priority queue to store vertices with their current shortest distance
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Vertex(source, 0));

        while (!priorityQueue.isEmpty()) {
            Vertex current = priorityQueue.poll();
            String currentVertex = current.name;

            // Process each neighbor of the current vertex
            for (Map.Entry<String, Integer> neighbor : graph.get(currentVertex).entrySet()) {
                String neighborVertex = neighbor.getKey();
                int edgeWeight = neighbor.getValue();
                int newDistance = distances.get(currentVertex) + edgeWeight;

                // If a shorter path to the neighbor is found
                if (newDistance < distances.get(neighborVertex)) {
                    distances.put(neighborVertex, newDistance);
                    priorityQueue.add(new Vertex(neighborVertex, newDistance));
                }
            }
        }

        return distances; // Return the shortest distances to all vertices
    }

    // Helper class for priority queue (vertex with its distance)
    static class Vertex implements Comparable<Vertex> {
        String name;
        int distance;

        Vertex(String name, int distance) {
            this.name = name;
            this.distance = distance;
        }

        @Override
        public int compareTo(Vertex other) {
            return Integer.compare(this.distance, other.distance); // Compare based on distance
        }
    }

    public static void main(String[] args) {
        // Example graph as an adjacency list
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        graph.put("A", Map.of("B", 1, "C", 4));
        graph.put("B", Map.of("A", 1, "C", 2, "D", 5));
        graph.put("C", Map.of("A", 4, "B", 2, "D", 1));
        graph.put("D", Map.of("B", 5, "C", 1));

        String source = "A";
        Map<String, Integer> shortestPaths = dijkstra(graph, source);

        // Print shortest distances from the source
        System.out.println("Shortest distances from " + source + ":");
        for (Map.Entry<String, Integer> entry : shortestPaths.entrySet()) {
            System.out.println("To " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
