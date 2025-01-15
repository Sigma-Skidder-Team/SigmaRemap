// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import java.util.Iterator;
import java.util.ArrayList;
import com.mojang.datafixers.util.Pair;
import java.util.stream.Stream;
import com.google.common.collect.Lists;
import java.util.Optional;
import java.util.List;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8556 extends DataFix
{
    public Class8556(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.method28747((com.mojang.datafixers.types.Type<Object>)this.getInputSchema().getTypeRaw(Class9451.field40622));
    }
    
    private <IS> TypeRewriteRule method28747(final Type<IS> type) {
        return this.fixTypeEverywhereTyped("EntityEquipmentToArmorAndHandFix", this.getInputSchema().getType(Class9451.field40626), this.getOutputSchema().getType(Class9451.field40626), typed -> {
            DSL.fieldFinder("Equipment", (Type)DSL.list((Type)type2));
            DSL.typeFinder(DSL.and(DSL.optional((Type)DSL.field("Equipment", (Type)DSL.list((Type)type2))), DSL.remainderType()));
            DSL.and(DSL.optional((Type)DSL.field("ArmorItems", (Type)DSL.list((Type)type2))), DSL.optional((Type)DSL.field("HandItems", (Type)DSL.list((Type)type2))), DSL.remainderType());
            Either.right((Object)DSL.unit());
            Either.right((Object)DSL.unit());
            Dynamic dynamic = (Dynamic)typed.getOrCreate(DSL.remainderFinder());
            typed.getOptional(opticFinder);
            final Optional optional;
            Either left = null;
            Either left2 = null;
            if (!(!optional.isPresent())) {
                final List list = optional.get();
                ((Optional)type3.read(dynamic.emptyMap()).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse newly created empty itemstack."));
                final Object o2;
                if (!list.isEmpty()) {
                    left = Either.left((Object)Lists.newArrayList(new Object[] { list.get(0), o2 }));
                }
                if (list.size() > 1) {
                    Lists.newArrayList(new Object[] { o2, o2, o2, o2 });
                    int i = 0;
                    final ArrayList list2;
                    while (i < Math.min(list.size(), 5)) {
                        list2.set(i - 1, list.get(i));
                        ++i;
                    }
                    left2 = Either.left((Object)list2);
                }
            }
            dynamic.get("DropChances").asStreamOpt();
            final Optional optional2;
            if (!(!optional2.isPresent())) {
                Stream.concat((Stream<?>)optional2.get(), Stream.generate(() -> dynamic2.createInt(0))).iterator();
                final Iterator iterator;
                iterator.next().asFloat(0.0f);
                if (!dynamic.get("HandDropChances").get().isPresent()) {
                    final float n;
                    dynamic = dynamic.set("HandDropChances", dynamic.emptyMap().merge(dynamic.createFloat(n)).merge(dynamic.createFloat(0.0f)));
                }
                if (!dynamic.get("ArmorDropChances").get().isPresent()) {
                    dynamic = dynamic.set("ArmorDropChances", dynamic.emptyMap().merge(dynamic.createFloat(iterator.next().asFloat(0.0f))).merge(dynamic.createFloat(iterator.next().asFloat(0.0f))).merge(dynamic.createFloat(iterator.next().asFloat(0.0f))).merge(dynamic.createFloat(iterator.next().asFloat(0.0f))));
                }
                dynamic = dynamic.remove("DropChances");
            }
            return typed.set(opticFinder2, type4, (Object)Pair.of((Object)left, (Object)Pair.of((Object)left2, (Object)dynamic)));
        });
    }
}
