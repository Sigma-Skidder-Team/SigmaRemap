// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5179 extends Class5174
{
    public Class5179(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(final Schema schema) {
        final Map registerBlockEntities = super.registerBlockEntities(schema);
        method16145(schema, registerBlockEntities, "minecraft:barrel");
        method16145(schema, registerBlockEntities, "minecraft:smoker");
        method16145(schema, registerBlockEntities, "minecraft:blast_furnace");
        schema.register(registerBlockEntities, "minecraft:lectern", p1 -> DSL.optionalFields("Book", Class9451.field40622.in(schema2)));
        schema.registerSimple(registerBlockEntities, "minecraft:bell");
        return registerBlockEntities;
    }
    
    public static void method16145(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema2))));
    }
}
