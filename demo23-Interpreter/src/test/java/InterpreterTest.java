import org.junit.jupiter.api.Test;
import program.component.ProgramCanvas;
import program.component.ProgramFrame;
import program.interpreter.Context;
import program.interpreter.ParserException;
import program.interpreter.ProgramNode;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class InterpreterTest {
    @Test
    void interpreterTest() throws IOException, ParserException {
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("D:\\git\\DesignPatterns\\demo23-Interpreter\\src\\main\\resources\\program.txt"));
        String line;
        while ((line = lineNumberReader.readLine()) != null) {
            System.out.println("text = " + line);
            ProgramNode programNode = new ProgramNode();
            programNode.parse(new Context(line));
            programNode.execute();
            System.out.println("programNode = " + programNode);
        }
        lineNumberReader.close();

        int in = System.in.read();
    }
}
