// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5200 extends Class5174
{
    public Class5200(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(final Schema schema) {
        final Map registerBlockEntities = super.registerBlockEntities(schema);
        schema.registerSimple(registerBlockEntities, "minecraft:conduit");
        return registerBlockEntities;
    }
}