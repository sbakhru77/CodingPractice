package DataStructureAndAlgo;

import java.util.Stack;

public class Graph {
	
	private final int MAX_VERTS = 20;
	private Vertex vertexList[];
	private int adjMat[][];
	private int nVerts;
	
	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		
		for(int i=0; i<MAX_VERTS; i++)
			for(int j=0; j<MAX_VERTS; j++)
				adjMat[i][j] = 0;
	}
	
	public void addVertex(int ch) {
		vertexList[nVerts++] = new Vertex(ch);
	}
	
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	public void displayVertex(int v) {
		System.out.println(vertexList[v].ch);
	}

	public int getAdjUnvisitedVertex(int v) {
		for(int i = 0; i<nVerts; i++)
			if ((adjMat[v][i]==1) && (vertexList[i].wasVisited == false))
				return i;
		
		return -1;
	}
	
	//Step 1: Push the root node in the Stack.  
	//Step 2: Loop until stack is empty. 
	//Step 3: Peek the node of the stack.  
	//Step 4: If the node has unvisited child nodes, get the unvisited child node, mark it as traversed and push it on stack.   
	//Step 5: If the node does not have any unvisited child nodes, pop the node from the stack.

	public void dfs() {
		Stack<Integer> st = new Stack<Integer>();
		st.push(vertexList[0].ch);
		vertexList[0].wasVisited = true;
		
		while(!st.isEmpty()) {
			int c = st.peek();
			int v = getAdjUnvisitedVertex(c);
			
			if (v != -1) {
				vertexList[v].wasVisited = true;
				displayVertex(v);
				st.push(vertexList[v].ch);
			}
			else
				st.pop();
		}
		 
	}
	
	
	//Step 1: Push the root node in the Queue.
	//Step 2: Loop until the queue is empty.
	//Step 3: Remove the node from the Queue.
	//Step 4: If the removed node has unvisited child nodes, mark them as visited and insert the unvisited children in the queue.
	
	public void bfs(Vertex root) {
		
	}
	
	public static void main(String[] args) {
		Graph g = new Graph();
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addVertex(5);

		g.addEdge(0, 1); //AB
		g.addEdge(1, 2); //BC
		g.addEdge(0, 3); //AD
		g.addEdge(3, 4); //DE

		g.dfs();
	}
}

class Vertex {
	int ch;

	boolean wasVisited;
	
	public Vertex(int ch) {
		this.ch = ch;
		this.wasVisited = false;
	}
}
