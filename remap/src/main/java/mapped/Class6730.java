// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.templates.Hook$HookFunction;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class6730 extends Schema
{
    public Class6730(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, Class9451.field40622, () -> DSL.hook(DSL.optionalFields("id", Class9451.field40628.in(schema2), "tag", DSL.optionalFields("EntityTag", Class9451.field40625.in(schema2), "BlockEntityTag", Class9451.field40621.in(schema2), "CanDestroy", DSL.list(Class9451.field40627.in(schema2)), "CanPlaceOn", DSL.list(Class9451.field40627.in(schema2)))), Class8173.field33677, Hook$HookFunction.IDENTITY));
    }
}
