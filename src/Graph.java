import java.util.HashSet;
import java.util.List;
import java.util.Set;

public record Graph (List<Node> Nodes){
    @Override
    public String toString() {
        var vertices = new HashSet<String>();
        for (var n : Nodes){
            vertices.add(n.NodeA());
            vertices.add(n.NodeB());
        }

        var edges = new StringBuilder();
        for (var n : Nodes){
            edges.append(n.toString()).append("\n");
        }
        return "Vertices... \n "+vertices+"\n\n"
                +"Edges... \n"+ edges;
    }
}
