import com.myparser.parser.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomVisitor extends graphvizGrammarBaseVisitor<Object>{
    @Override public Object visitGraph(graphvizGrammarParser.GraphContext ctx) {
        var graph = new Graph(new ArrayList<>());
        var children = ctx.node();
        for (var i = 0; i < children.size(); i++){
            graph.Nodes().add((Node)visitNode(children.get(i)));
        }
        return graph;
    }

    @Override public Object visitNode(graphvizGrammarParser.NodeContext ctx) {
        var weightCheck = ctx.weight();
        var l = visitVertex(ctx.vertex(0));
        var r = visitVertex(ctx.vertex(1));
        if(weightCheck.size() > 0){
            var weight = Integer.valueOf(visitWeight(ctx.weight(0)).toString());
            return new Node(l.toString(), r.toString(), Optional.of(weight));
        }

        return new Node(l.toString(), r.toString(), Optional.empty());
    }

    @Override public Object visitVertex(graphvizGrammarParser.VertexContext ctx) {
        return ctx.LETTER();
    }

    @Override public Object visitWeight(graphvizGrammarParser.WeightContext ctx) {
        return ctx.INT();
    }

}
