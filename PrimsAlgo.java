import java.util.*;

class PrimsAlgo {
    int V;
    int[][] graph;
    
    public PrimsAlgo(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    
    public void addEdge(int u, int v, int weight) {
        graph[u][v] = weight;
        graph[v][u] = weight; 
    }
    
    // implement Prim's algorithm
    public void primMST() {
        boolean[] inMST = new boolean[V];
                int[] parent = new int[V];
                int[] key = new int[V];
        
        Arrays.fill(key, Integer.MAX_VALUE);
        
        key[0] = 0;
        parent[0] = -1; 
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(u -> key[u]));
        
        pq.add(0);
        
        while (!pq.isEmpty()) {
            int u = pq.poll();
            
            inMST[u] = true;
            
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !inMST[v] && graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                    parent[v] = u;
                    
                    pq.add(v);
                }
            }
        }
        
        printMST(parent);
    }
    
    public void printMST(int[] parent) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println((char)(parent[i] + 'a') + " - " + (char)(i + 'a') + "\t" + graph[i][parent[i]]);
        }
    }
    
    public static void main(String[] args) {
        PrimsAlgo p = new PrimsAlgo(7);  // Graph for 7 vertices
        
        // Add edges to the graph
        p.addEdge(0, 5, 5); 
        p.addEdge(5, 4, 15); 
        p.addEdge(4, 3, 30); 
        p.addEdge(3, 2, 4); 
        p.addEdge(2, 1, 20); 
        p.addEdge(1, 0, 8); 
        p.addEdge(1, 5, 10); 
        p.addEdge(1, 6, 2); 
        p.addEdge(5, 6, 3); 
        p.addEdge(2, 6, 12); 
        p.addEdge(6, 4, 35); 
        p.addEdge(3, 6, 18); 
        
        p.primMST();
    }
}

