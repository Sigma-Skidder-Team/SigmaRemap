// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5181 extends Class5174
{
    public Class5181(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static void method16149(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register(map, s, () -> Class9478.method35286(schema2));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        method16149(schema, registerEntities, "minecraft:bee");
        method16149(schema, registerEntities, "minecraft:bee_stinger");
        return registerEntities;
    }
    
    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(final Schema schema) {
        final Map registerBlockEntities = super.registerBlockEntities(schema);
        schema.register(registerBlockEntities, "minecraft:beehive", () -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema2)), "Bees", DSL.list(DSL.optionalFields("EntityData", Class9451.field40625.in(schema2)))));
        return registerBlockEntities;
    }
}
