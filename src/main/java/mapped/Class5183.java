// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5183 extends Class5174
{
    public Class5183(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, (Map)map, (Map)map2);
        schema.registerType(false, Class9451.field40617, () -> {
            final Object o = () -> {};
            return DSL.optionalFields("stats", DSL.optionalFields("minecraft:mined", DSL.compoundList(Class9451.field40627.in(schema2), DSL.constType(DSL.intType())), "minecraft:crafted", (TypeTemplate)supplier.get(), "minecraft:used", (TypeTemplate)supplier.get(), "minecraft:broken", (TypeTemplate)supplier.get(), "minecraft:picked_up", (TypeTemplate)supplier.get(), DSL.optionalFields("minecraft:dropped", (TypeTemplate)supplier.get(), "minecraft:killed", DSL.compoundList(Class9451.field40624.in(schema2), DSL.constType(DSL.intType())), "minecraft:killed_by", DSL.compoundList(Class9451.field40624.in(schema2), DSL.constType(DSL.intType())), "minecraft:custom", DSL.compoundList(DSL.constType(DSL.namespacedString()), DSL.constType(DSL.intType())))));
        });
    }
}
