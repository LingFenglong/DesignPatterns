import java.util.ArrayList;

public class MultiStringDisplay extends Display {
    private final ArrayList<String> strings = new ArrayList<>();
    private int columns = 0;

    public void add(String string) {
        strings.add(string);
        columns = Math.max(string.getBytes().length, columns);
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        String str = strings.get(row);
        return str.length() < columns ?
                str + getBlankString(columns - str.length()) :
                str;
    }

    private String getBlankString(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
