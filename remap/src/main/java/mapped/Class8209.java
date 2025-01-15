// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class8209 extends Schema
{
    public Class8209(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static void method27200(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> Class9478.method35286(schema2));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        method27200(schema, registerEntities, "ElderGuardian");
        return registerEntities;
    }
}
