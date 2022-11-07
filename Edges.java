public class Edges {
    private Node start;
    private Node end;
    public Edges(Node starts, Node ends){
        start = starts;
        end = ends;
    }
    public String toString(){
        return(start + " connects " + end);
    }
    public int[] getEdges(){
        int[] test = new int[2];
        test[0] = start.getNode();
        test[1] = end.getNode();

        return test;
    }

}
