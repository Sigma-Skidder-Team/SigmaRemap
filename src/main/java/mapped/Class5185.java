// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5185 extends Class5174
{
    public Class5185(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static void method16157(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> Class9478.method35286(schema2));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        method16157(schema, registerEntities, "minecraft:turtle");
        method16157(schema, registerEntities, "minecraft:cod_mob");
        method16157(schema, registerEntities, "minecraft:tropical_fish");
        method16157(schema, registerEntities, "minecraft:salmon_mob");
        method16157(schema, registerEntities, "minecraft:puffer_fish");
        method16157(schema, registerEntities, "minecraft:phantom");
        method16157(schema, registerEntities, "minecraft:dolphin");
        method16157(schema, registerEntities, "minecraft:drowned");
        schema.register(registerEntities, "minecraft:trident", p1 -> DSL.optionalFields("inBlockState", Class9451.field40623.in(schema2)));
        return registerEntities;
    }
}
