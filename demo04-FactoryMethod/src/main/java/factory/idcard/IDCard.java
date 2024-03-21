package factory.idcard;

import cn.hutool.core.lang.generator.SnowflakeGenerator;
import factory.framwork.Product;

public class IDCard extends Product {
    private final String owner;
    private final Long number;
    IDCard(String owner, Long number) {
        System.out.println(owner + "制作了IDCard");
        this.owner = owner;
        this.number = number;
    }

    @Override
    public void use() {
        System.out.println(owner + "使用了IDCard");
    }

    public String getOwner() {
        return this.owner;
    }

    public Long getNumber() {
        return number;
    }
}
