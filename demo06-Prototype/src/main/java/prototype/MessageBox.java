package prototype;

import prototype.framwork.Product;

public class MessageBox implements Product, Cloneable {
    private final char decorateChar;

    public MessageBox(char decorateChar) {
        this.decorateChar = decorateChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length + 4;
        for (int i = 0; i < length; i++) {
            System.out.print(decorateChar);
        }
        System.out.println();

        System.out.println(decorateChar + " " + s + " " + decorateChar);

        for (int i = 0; i < length; i++) {
            System.out.print(decorateChar);
        }
        System.out.println();
    }
}
