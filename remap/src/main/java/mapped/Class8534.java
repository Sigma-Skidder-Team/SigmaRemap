// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class8534 extends Schema
{
    public Class8534(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        registerEntities.remove("EntityHorse");
        schema.register(registerEntities, "Horse", () -> DSL.optionalFields("ArmorItem", Class9451.field40622.in(schema2), "SaddleItem", Class9451.field40622.in(schema2), Class9478.method35286(schema2)));
        schema.register(registerEntities, "Donkey", () -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema3)), "SaddleItem", Class9451.field40622.in(schema3), Class9478.method35286(schema3)));
        schema.register(registerEntities, "Mule", () -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema4)), "SaddleItem", Class9451.field40622.in(schema4), Class9478.method35286(schema4)));
        schema.register(registerEntities, "ZombieHorse", () -> DSL.optionalFields("SaddleItem", Class9451.field40622.in(schema5), Class9478.method35286(schema5)));
        schema.register(registerEntities, "SkeletonHorse", () -> DSL.optionalFields("SaddleItem", Class9451.field40622.in(schema6), Class9478.method35286(schema6)));
        return registerEntities;
    }
}
