// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class8400 extends Schema
{
    public Class8400(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static void method28018(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register(map, s, () -> Class9478.method35286(schema2));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        method28018(schema, registerEntities, "WitherSkeleton");
        method28018(schema, registerEntities, "Stray");
        return registerEntities;
    }
}
