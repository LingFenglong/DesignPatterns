public class UpDownBorder extends Border {
    protected UpDownBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows() - 1) {
            return makeLine();
        } else {
            return display.getRowText(row - 1);
        }
    }
}
