package program.command;

public interface DrawCommand {
    DrawStepCommand execute();
    void addHistory();
}
