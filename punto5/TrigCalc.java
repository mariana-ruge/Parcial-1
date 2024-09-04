import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class TrigCalc {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
        TrigLexer lexer = new TrigLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrigParser parser = new TrigParser(tokens);
        ParseTree tree = parser.program();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}

class EvalVisitor extends TrigBaseVisitor<Double> {
    @Override
    public Double visitSinExpr(TrigParser.SinExprContext ctx) {
        double value = Double.parseDouble(ctx.NUMBER().getText());
        System.out.println(Math.sin(Math.toRadians(value)));
        return 0.0;
    }

    @Override
    public Double visitCosExpr(TrigParser.CosExprContext ctx) {
        double value = Double.parseDouble(ctx.NUMBER().getText());
        System.out.println(Math.cos(Math.toRadians(value)));
        return 0.0;
    }

    @Override
    public Double visitTanExpr(TrigParser.TanExprContext ctx) {
        double value = Double.parseDouble(ctx.NUMBER().getText());
        System.out.println(Math.tan(Math.toRadians(value)));
        return 0.0;
    }
}
