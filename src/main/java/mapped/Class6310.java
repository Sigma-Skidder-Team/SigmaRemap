// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class6310 extends Schema
{
    public Class6310(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, (Map)map, (Map)map2);
        schema.registerType(false, Class9451.field40633, () -> DSL.constType(DSL.namespacedString()));
        schema.registerType(false, Class9451.field40612, () -> DSL.optionalFields("RootVehicle", DSL.optionalFields("Entity", Class9451.field40625.in(schema2)), "Inventory", DSL.list(Class9451.field40622.in(schema2)), "EnderItems", DSL.list(Class9451.field40622.in(schema2)), DSL.optionalFields("ShoulderEntityLeft", Class9451.field40625.in(schema2), "ShoulderEntityRight", Class9451.field40625.in(schema2), "recipeBook", DSL.optionalFields("recipes", DSL.list(Class9451.field40633.in(schema2)), "toBeDisplayed", DSL.list(Class9451.field40633.in(schema2))))));
        schema.registerType(false, Class9451.field40614, () -> DSL.compoundList(DSL.list(Class9451.field40622.in(schema3))));
    }
}
