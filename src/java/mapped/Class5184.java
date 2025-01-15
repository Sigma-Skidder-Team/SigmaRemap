// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5184 extends Class5174
{
    public Class5184(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        schema.register(registerEntities, "minecraft:wandering_trader", p1 -> DSL.optionalFields("Inventory", DSL.list(Class9451.field40622.in(schema2)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", Class9451.field40622.in(schema2), "buyB", Class9451.field40622.in(schema2), "sell", Class9451.field40622.in(schema2)))), Class9478.method35286(schema2)));
        schema.register(registerEntities, "minecraft:trader_llama", p1 -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema3)), "SaddleItem", Class9451.field40622.in(schema3), "DecorItem", Class9451.field40622.in(schema3), Class9478.method35286(schema3)));
        return registerEntities;
    }
}
