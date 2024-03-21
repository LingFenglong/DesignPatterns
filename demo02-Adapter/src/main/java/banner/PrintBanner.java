package banner;
//public class banner.PrintBanner extends banner.Banner implements banner.Print {
//    public banner.PrintBanner(String string) {
//        super(string);
//    }
//
//    @Override
//    public void printWeek() {
//        showWithParen();
//    }
//
//    @Override
//    public void printStrong() {
//        showWithAster();
//    }
//}

public class PrintBanner implements Print {
    private final Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
