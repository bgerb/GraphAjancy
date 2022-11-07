import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class graphTest{
    @Test
    void BNode(){ // basic node test
        Node test = new Node(123);
        assertEquals("123", test.toString());


    }
    @Test
    void BEdges(){ // basic edge test
        Node test1 = new Node(123);
        Node test2 = new Node(567);
        Edges test = new Edges(test1,test2);
        assertEquals("123 connects 567", test.toString());

    }
    @Test
    void BGraph(){ // basic graph test
        Node test1 = new Node(123);
        Node test2 = new Node(567);
        Edges test = new Edges(test1, test2);
        Node[] node = new Node[] {test1,test2};
        Edges[] edge = new Edges[]{test};
        Graph fin = new Graph(node,edge);
        assertEquals("List of nodes:\n123\n567\nList of edges:\n123 connects 567\n", fin.toString());

    }
    @Test
    void ManyNodes(){
        Node test1 = new Node(1);
        Node test2 = new Node(2);
        Node test3 = new Node(3);
        Node test4 = new Node(4);
        Node test5 = new Node(5);
        Node test6 = new Node(6);
        Node test7 = new Node(7);
        Node test8 = new Node(8);
        assertEquals("12345678", test1.toString()+test2.toString()+test3.toString()+test4.toString()+test5.toString()+test6.toString()+test7.toString()+test8.toString());
    }
    @Test
    void GraphaddFakeEdge(){ // should print text
        Node test1 = new Node(123);
        Node test2 = new Node(567);
        Edges test = new Edges(test1, test2);
        Node[] node = new Node[] {test1,test2};
        Edges[] edge = new Edges[]{test};
        Graph fin = new Graph(node,edge);
        fin.addEdge(3,7);
    }
    @Test
    void TestAjancy(){
        Node[] node = new Node[10];
        Edges[] edge = new Edges[8];
        Node test1 = new Node(1);
        Node test2 = new Node(2);
        Node test3 = new Node(3);
        Node test4 = new Node(4);
        Node test5 = new Node(5);
        Node test6 = new Node(6);
        Node test7 = new Node(7);
        Node test8 = new Node(8);
        Node test9 = new Node(9);
        Node test10 = new Node(10);

        Edges edge1 = new Edges(test1,test3);
        Edges edge2 = new Edges(test1,test4);
        Edges edge3 = new Edges(test1,test6);
        Edges edge4 = new Edges(test1,test9);
        Edges edge5 = new Edges(test2,test3);
        Edges edge6 = new Edges(test2,test7);
        Edges edge7 = new Edges(test2,test4);
        Edges edge8 = new Edges(test6,test8);
        node[0] = test1;
        node[1] = test2;
        node[2] = test3;
        node[3] = test4;
        node[4] = test5;
        node[5] = test6;
        node[6] = test7;
        node[7] = test8;
        node[8] = test9;
        node[9] = test10;
        edge[0] = edge1;
        edge[1] = edge2;
        edge[2] = edge3;
        edge[3] = edge4;
        edge[4] = edge5;
        edge[5] = edge6;
        edge[6] = edge7;
        edge[7] = edge8;

        Graph graph = new Graph(node, edge);
        System.out.print(graph.printAjac());
        System.out.println(graph.isEdge(test1,test4));
        System.out.println(graph.isEdge(test1,test1));



    }
}
