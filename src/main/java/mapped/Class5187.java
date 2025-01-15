// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.schemas.Schema;

public class Class5187 extends Class5174
{
    public Class5187(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static TypeTemplate method16162(final Schema schema) {
        return DSL.optionalFields("ArmorItems", DSL.list(Class9451.field40622.in(schema)), "HandItems", DSL.list(Class9451.field40622.in(schema)));
    }
    
    public static void method16163(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> method16162(schema2));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        registerEntities.remove("minecraft:illager_beast");
        method16163(schema, registerEntities, "minecraft:ravager");
        return registerEntities;
    }
}
