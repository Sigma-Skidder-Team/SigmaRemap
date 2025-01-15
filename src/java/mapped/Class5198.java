// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5198 extends Class5174
{
    public Class5198(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, (Map)map, (Map)map2);
        schema.registerType(false, Class9451.field40630, () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", Class9451.field40623.in(schema2), "CB", Class9451.field40623.in(schema2), "CC", Class9451.field40623.in(schema2), "CD", Class9451.field40623.in(schema2)))));
    }
}
