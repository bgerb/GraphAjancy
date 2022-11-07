import java.util.ArrayList;
public class Graph {
    private ArrayList<Node> node = new ArrayList<Node>();
    private ArrayList<Edges> edge = new ArrayList<Edges>();
    private int[][] ajancy;
    private int max;

    public Graph(Node[] nodes, Edges[] edges){ // sets up a graph with an two lists and then sets up an ajancy matrix
        for(int i=0; i<nodes.length; ++i){

        node.add(nodes[i]);}

        for(int i=0; i<edges.length; ++i){

            edge.add(edges[i]);}
        max = 0;
        for(int i =0; i<edge.size(); ++i){

            int[] hmm = edge.get(i).getEdges();
            if(hmm[0] > max) max = hmm[0]+1;
            if(hmm[1] > max) max = hmm[1]+1;
        }
        ajancy = new int[max][max];
        for(int i =0; i<edge.size(); ++i) {
            int[] hmm = edge.get(i).getEdges();
            ajancy[hmm[1]][hmm[0]] = 1;
            ajancy[hmm[0]][hmm[1]] = 1;
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("List of nodes:\n");
        for(Node i : node){
            sb.append(i + "\n");
        }
        sb.append("List of edges:\n");
        for(Edges i : edge){
            sb.append(i + "\n");
        }
        return sb.toString();
    }
    public void addEdge(int pos1, int pos2){ // adds an edge to the graph and then adds it to the ajancy
        boolean addtograph = true;
        if(pos1 > max || pos2 >max) addtograph = false;
        if(pos2 > node.size() || pos1 >node.size()) {System.out.println("not real node");
            return;}
        Edges toadd = new Edges(node.get(pos1), node.get(pos2));
        edge.add(toadd);
        if(addtograph){
            ajancy[pos1][pos2] = 1;
            ajancy[pos2][pos1] = 1;
        }

    }
    public void addNode(int add){
        node.add(new Node(add));
    }
    public void addNode(Node add){
        node.add(add);
    }
    public String printAjac(){ // prints the ajancy matrix
        String test = "";
        for(int i =0; i<ajancy.length; ++i){
            for(int k=0; k<ajancy[0].length; ++k){
                test += ajancy[i][k] + " ";

            }
            test += "\n";
        }
        return test;
    }
    public boolean isEdge(Node t, Node s){ // checks if it is an edge at a spot
        if(ajancy[t.getNode()][s.getNode()] == 1) return true;
        return false;

    }
}
