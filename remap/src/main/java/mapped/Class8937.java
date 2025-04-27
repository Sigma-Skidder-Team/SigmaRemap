// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import java.util.Optional;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8937 extends DataFix
{
    public Class8937(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ItemWaterPotionFix", this.getInputSchema().getType(Class9451.field40622), typed -> {
            DSL.fieldFinder("id", DSL.named(Class9451.field40628.typeName(), DSL.namespacedString()));
            final Type type;
            type.findField("tag");
            typed.getOptional(opticFinder);
            final Optional optional;
            if (optional.isPresent()) {
                final String s = (String)optional.get().getSecond();
                if (!"minecraft:potion".equals(s)) {
                    if (!"minecraft:splash_potion".equals(s)) {
                        if (!"minecraft:lingering_potion".equals(s)) {
                            if (!"minecraft:tipped_arrow".equals(s)) {
                                return typed;
                            }
                        }
                    }
                }
                typed.getOrCreateTyped(opticFinder2);
                final Typed typed2;
                Dynamic set = (Dynamic)typed2.get(DSL.remainderFinder());
                if (!set.get("Potion").asString().isPresent()) {
                    set = set.set("Potion", set.createString("minecraft:water"));
                }
                return typed.set(opticFinder2, typed2.set(DSL.remainderFinder(), set));
            }
            return typed;
        });
    }
}
