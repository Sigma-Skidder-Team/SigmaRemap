// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.util.Pair;
import java.util.function.Supplier;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class6137 extends Class6132
{
    public Class6137(final Schema schema, final boolean b) {
        super(schema, b, "EntityHorseSaddleFix", Class9451.field40626, "EntityHorse");
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        final OpticFinder fieldFinder = DSL.fieldFinder("id", DSL.named(Class9451.field40628.typeName(), DSL.namespacedString()));
        final Type typeRaw = this.getInputSchema().getTypeRaw(Class9451.field40622);
        final OpticFinder fieldFinder2 = DSL.fieldFinder("SaddleItem", typeRaw);
        final Optional optionalTyped = typed.getOptionalTyped(fieldFinder2);
        final Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
        if (!optionalTyped.isPresent() && dynamic.get("Saddle").asBoolean(false)) {
            final Typed set = typeRaw.pointTyped(typed.getOps()).orElseThrow(IllegalStateException::new).set(fieldFinder, (Object)Pair.of((Object)Class9451.field40628.typeName(), (Object)"minecraft:saddle"));
            final Dynamic emptyMap = dynamic.emptyMap();
            final Dynamic set2 = emptyMap.set("Count", emptyMap.createByte((byte)1));
            final Typed set3 = set.set(DSL.remainderFinder(), (Object)set2.set("Damage", set2.createShort((short)0)));
            dynamic.remove("Saddle");
            return (Typed<?>)typed.set(fieldFinder2, set3).set(DSL.remainderFinder(), (Object)dynamic);
        }
        return typed;
    }
}
