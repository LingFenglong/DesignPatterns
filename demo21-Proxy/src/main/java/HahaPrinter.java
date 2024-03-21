public class HahaPrinter extends Printer {
    @Override
    public void print(String string) {
        super.print("Haha ==> " + string + "<== Haha");
    }
}
