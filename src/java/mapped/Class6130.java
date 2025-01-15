// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import java.util.stream.Stream;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class6130 extends DataFix
{
    public Class6130(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type type = this.getInputSchema().getType(Class9451.field40622);
        DSL.fieldFinder("id", DSL.named(Class9451.field40628.typeName(), DSL.namespacedString()));
        type.findField("tag");
        return this.fixTypeEverywhereTyped("ItemBannerColorFix", type, typed -> {
            final OpticFinder opticFinder4;
            opticFinder4.type().findField("BlockEntityTag");
            typed.getOptional(opticFinder);
            final Optional optional;
            if (optional.isPresent() && Objects.equals(optional.get().getSecond(), "minecraft:banner")) {
                final Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
                typed.getOptionalTyped(opticFinder2);
                final Optional optional2;
                if (!(!optional2.isPresent())) {
                    final Typed typed2 = optional2.get();
                    typed2.getOptionalTyped(opticFinder3);
                    final Optional optional3;
                    if (!(!optional3.isPresent())) {
                        final Typed typed3 = optional3.get();
                        final Dynamic dynamic2 = (Dynamic)typed2.get(DSL.remainderFinder());
                        final Dynamic dynamic3 = (Dynamic)typed3.getOrCreate(DSL.remainderFinder());
                        if (!(!dynamic3.get("Base").asNumber().isPresent())) {
                            dynamic.set("Damage", dynamic.createShort((short)(dynamic3.get("Base").asInt(0) & 0xF)));
                            dynamic2.get("display").get();
                            final Optional optional4;
                            final Dynamic dynamic4;
                            if (!(!optional4.isPresent())) {
                                final Dynamic a = optional4.get();
                                if (!(!Objects.equals(a, a.emptyMap().merge(a.createString("Lore"), a.createList((Stream)Stream.of(a.createString("(+NBT"))))))) {
                                    return typed.set(DSL.remainderFinder(), (Object)dynamic4);
                                }
                            }
                            dynamic3.remove("Base");
                            return typed.set(DSL.remainderFinder(), (Object)dynamic4).set(opticFinder2, typed2.set(opticFinder3, typed3.set(DSL.remainderFinder(), (Object)dynamic3)));
                        }
                    }
                }
                return typed.set(DSL.remainderFinder(), (Object)dynamic);
            }
            else {
                return typed;
            }
        });
    }
}
