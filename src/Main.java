import com.myparser.parser.graphvizGrammarLexer;
import com.myparser.parser.graphvizGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Optional;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        try{
            var inputOptionPane = JOptionPane.showInputDialog("Ingrese código en notación DOT:");
            var expression = "digraph {"+inputOptionPane+"}";
            var inputStream = new ByteArrayInputStream(expression.getBytes());
            var lexer = new graphvizGrammarLexer(CharStreams.fromStream(inputStream));
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new graphvizGrammarParser(tokenStream);
            var startrule = parser.graph();
            var visitor = new CustomVisitor();
            visitor.visit(startrule);
            var result = (Graph)visitor.visitGraph(startrule);
            System.out.println(result);

            var file = new FileWriter("graph.dot");
            file.write(expression);
            file.close();

            var pb = new ProcessBuilder("dot","-Tpng","-o","graph.png","graph.dot");
            pb.redirectErrorStream(true);
            pb.start();

            Thread.sleep(1000);
            var graphImage = new ImageIcon("graph.png");
            JOptionPane.showMessageDialog(null
                    , result.toString()
                    , "Grafo generado"
                    , JOptionPane.INFORMATION_MESSAGE
                    , graphImage);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}