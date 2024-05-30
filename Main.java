import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;

            int m = sc.nextInt();
            List<List<Edge>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;
                int d = sc.nextInt();
                graph.get(a).add(new Edge(b, d));
                graph.get(b).add(new Edge(a, d));
            }

            int[] dist1 = dijkstra(graph, 0);
            int[] dist2 = dijkstra(graph, 1);
            int minDist = dist1[1];

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (Edge edge : graph.get(i)) {
                    if (dist1[i] + edge.dist + dist2[edge.to] == minDist) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static int[] dijkstra(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;

            if (node.dist != dist[u]) {
                continue;
            }

            for (Edge edge : graph.get(u)) {
                int v = edge.to;
                int alt = dist[u] + edge.dist;
                if (alt < dist[v]) {
                    dist[v] = alt;
                    pq.offer(new Node(v, alt));
                }
            }
        }

        return dist;
    }

    static class Node implements Comparable<Node> {
        int vertex;
        int dist;

        Node(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }

        public int compareTo(Node other) {
            return Integer.compare(dist, other.dist);
        }
    }

    static class Edge {
        int to;
        int dist;

        Edge(int to, int dist) {
            this.to = to;
            this.dist = dist;
        }
    }
}
