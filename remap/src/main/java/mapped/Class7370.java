// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.Typed;
import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import java.util.Optional;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class7370 extends DataFix
{
    public Class7370(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    private Dynamic<?> method22636(final Dynamic<?> dynamic) {
        final Optional value = dynamic.get("display").get();
        if (!value.isPresent()) {
            return dynamic;
        }
        Dynamic set = value.get();
        final Optional string = set.get("Name").asString();
        if (string.isPresent()) {
            set = set.set("Name", set.createString(((String)string.get()).replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"")));
        }
        return dynamic.set("display", set);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OminousBannerRenameFix", this.getInputSchema().getType(Class9451.field40622), typed -> {
            DSL.fieldFinder("id", DSL.named(Class9451.field40628.typeName(), DSL.namespacedString()));
            final Type type;
            type.findField("tag");
            typed.getOptional(opticFinder);
            final Optional optional;
            if (optional.isPresent()) {
                if (Objects.equals(optional.get().getSecond(), "minecraft:white_banner")) {
                    typed.getOptionalTyped(opticFinder2);
                    final Optional optional2;
                    if (optional2.isPresent()) {
                        final Typed typed2 = optional2.get();
                        return typed.set(opticFinder2, typed2.set(DSL.remainderFinder(), this.method22636((Dynamic<?>)typed2.get(DSL.remainderFinder()))));
                    }
                }
            }
            return typed;
        });
    }
}
