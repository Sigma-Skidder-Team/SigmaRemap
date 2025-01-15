// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class8606 extends Schema
{
    public Class8606(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, (Map)map, (Map)map2);
        schema.registerType(true, Class9451.field40629, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", Class9451.field40625.in(schema2))), "SpawnData", Class9451.field40625.in(schema2)));
    }
}
