/**
 * 只能生成三个实例，get方法 0, 1, 2 返回对应的实例
 */
public class Triple {
    private String info;
    private static final Triple[] triples = new Triple[3];

    static {
        for (int i = 0; i < triples.length; i++) {
            Triple triple = new Triple();
            triple.info = "第" + i + "个Triple";
            triples[i] = triple;
        }
    }

    private Triple() {

    }

    public static Triple getInstance() {
        return getInstance(0);
    }

    public static Triple getInstance(int i) {
        return triples[i];
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
