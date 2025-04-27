// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import java.util.Optional;
import com.mojang.datafixers.Dynamic;
import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class9483 extends DataFix
{
    public Class9483(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("BedItemColorFix", this.getInputSchema().getType(Class9451.field40622), typed -> {
            DSL.fieldFinder("id", DSL.named(Class9451.field40628.typeName(), DSL.namespacedString()));
            typed.getOptional(opticFinder);
            final Optional optional;
            if (optional.isPresent()) {
                if (Objects.equals(optional.get().getSecond(), "minecraft:bed")) {
                    final Dynamic dynamic = typed.get(DSL.remainderFinder());
                    if (dynamic.get("Damage").asInt(0) == 0) {
                        return typed.set(DSL.remainderFinder(), (Object)dynamic.set("Damage", dynamic.createShort((short)14)));
                    }
                }
            }
            return typed;
        });
    }
}
