import java.io.*;
import java.util.*;

public class isConnectedGraph {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }
    
      boolean []visited = new  boolean[vtces];
      boolean res = isGraphConnected(graph,0,visited);
      System.out.println(res);
   }
   
   public static boolean isGraphConnected(ArrayList<Edge>[]graph,int src , boolean []visited){
       if(visited.length-1 == src){
           return true;
       }
     
       visited[src]=true;
       for(Edge edge:graph[src]){
           if(visited[edge.nbr] == false){
               if(edge.nbr == src+1){
                   boolean res = isGraphConnected(graph,edge.nbr,visited);        
                   return res;
               }
           }
       }
       return false;
   }
   
}























