public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display) {
        this.display = display;
    }

    protected String makeLine() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+");
        for (int i = 0; i < getColumns() - 2; i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("+");
        return stringBuilder.toString();
    }
}
