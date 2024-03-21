package prototype;

import prototype.framwork.Product;

public class UnderlinePen implements Product, Cloneable {
    private final char underlineChar;

    public UnderlinePen(char underlineChar) {
        this.underlineChar = underlineChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length + 2;

        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length; i++) {
            System.out.print(underlineChar);
        }
        System.out.println();
    }
}
