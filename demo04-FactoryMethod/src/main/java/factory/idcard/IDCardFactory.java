package factory.idcard;

import cn.hutool.core.lang.generator.SnowflakeGenerator;
import factory.framwork.Factory;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory<IDCard> {
    private final Map<Long, String> owners = new HashMap<>();
    private final static SnowflakeGenerator snowflakeGenerator = new SnowflakeGenerator();

    @Override
    protected IDCard createProduct(String owner) {
        return new IDCard(owner, snowflakeGenerator.next());
    }

    @Override
    protected void registerProduct(IDCard product) {
        this.owners.put(product.getNumber(), product.getOwner());
    }

    public Map<Long, String> getOwners() {
        return this.owners;
    }
}
