// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5182 extends Class5174
{
    public Class5182(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(final Schema schema) {
        final Map registerBlockEntities = super.registerBlockEntities(schema);
        schema.register(registerBlockEntities, "minecraft:trapped_chest", () -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema2))));
        return registerBlockEntities;
    }
}
