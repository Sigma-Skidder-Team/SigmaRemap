// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import java.util.Optional;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.Dynamic;
import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class7369 extends DataFix
{
    public Class7369(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ItemInstanceMapIdFix", this.getInputSchema().getType(Class9451.field40622), typed -> {
            DSL.fieldFinder("id", DSL.named(Class9451.field40628.typeName(), DSL.namespacedString()));
            final Type type;
            type.findField("tag");
            typed.getOptional(opticFinder);
            final Optional optional;
            if (optional.isPresent() && Objects.equals(optional.get().getSecond(), "minecraft:filled_map")) {
                final Dynamic dynamic = typed.get(DSL.remainderFinder());
                typed.getOrCreateTyped(opticFinder2);
                final Typed typed2;
                final Dynamic dynamic2 = (Dynamic)typed2.get(DSL.remainderFinder());
                return typed.set(opticFinder2, typed2.set(DSL.remainderFinder(), dynamic2.set("map", dynamic2.createInt(dynamic.get("Damage").asInt(0)))));
            }
            else {
                return typed;
            }
        });
    }
}
