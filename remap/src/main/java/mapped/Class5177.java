// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5177 extends Class5174
{
    public Class5177(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static void method16143(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register(map, s, () -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema2))));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(final Schema schema) {
        final Map registerBlockEntities = super.registerBlockEntities(schema);
        method16143(schema, registerBlockEntities, "minecraft:shulker_box");
        return registerBlockEntities;
    }
}
