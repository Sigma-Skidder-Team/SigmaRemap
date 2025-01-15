// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class9062 extends Schema
{
    public Class9062(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, (Map)map, (Map)map2);
        schema.registerType(false, Class9451.field40612, () -> DSL.optionalFields("RootVehicle", DSL.optionalFields("Entity", Class9451.field40625.in(schema2)), "Inventory", DSL.list(Class9451.field40622.in(schema2)), "EnderItems", DSL.list(Class9451.field40622.in(schema2))));
        schema.registerType(true, Class9451.field40625, () -> DSL.optionalFields("Passengers", DSL.list(Class9451.field40625.in(schema3)), Class9451.field40626.in(schema3)));
    }
}
