import factory.idcard.IDCard;
import factory.idcard.IDCardFactory;
import org.junit.jupiter.api.Test;

public class FactoryTemplateTest {
    @Test
    void factoryTemplateTest() {
        IDCardFactory idCardFactory = new IDCardFactory();
        IDCard card1 = idCardFactory.create("LingFenglong");
        IDCard card2 = idCardFactory.create("ZhangSan");
        IDCard card3 = idCardFactory.create("LiSi");
        card1.use();
        card2.use();
        card3.use();

        System.out.println();
        System.out.println("已经注册的用户：");
        idCardFactory.getOwners().entrySet().forEach(System.out::println);

    }
}
