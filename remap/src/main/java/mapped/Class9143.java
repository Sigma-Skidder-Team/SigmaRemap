// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import java.util.Optional;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Dynamic;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Objects;
import com.mojang.datafixers.types.templates.CompoundList$CompoundListType;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class9143 extends DataFix
{
    public Class9143(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final CompoundList$CompoundListType compoundList = DSL.compoundList(DSL.string(), this.getInputSchema().getType(Class9451.field40630));
        compoundList.finder();
        return this.method33338((com.mojang.datafixers.types.templates.CompoundList$CompoundListType<String, Object>)compoundList);
    }
    
    private <SF> TypeRewriteRule method33338(final CompoundList$CompoundListType<String, SF> compoundList$CompoundListType) {
        final Type type = this.getInputSchema().getType(Class9451.field40613);
        final Type type2 = this.getInputSchema().getType(Class9451.field40630);
        type.findField("Level").type().findField("Structures");
        return TypeRewriteRule.seq(this.fixTypeEverywhereTyped("NewVillageFix", type, typed -> {
            final OpticFinder opticFinder2;
            opticFinder2.type().findField("Starts");
            compoundList$CompoundListType2.finder();
            return typed.updateTyped(opticFinder, typed2 -> typed2.updateTyped(opticFinder3, typed3 -> typed3.updateTyped(opticFinder4, typed4 -> typed4.update(opticFinder5, list -> list.stream().filter(pair -> !Objects.equals(pair.getFirst(), "Village")).map(pair2 -> pair2.mapFirst(s -> s.equals("New_Village") ? "Village" : s)).collect(Collectors.toList()))).update(DSL.remainderFinder(), dynamic -> dynamic.update("References", dynamic2 -> ((Dynamic)DataFixUtils.orElse((Optional)dynamic2.get("New_Village").get().map(dynamic4 -> dynamic3.remove("New_Village").merge(dynamic3.createString("Village"), dynamic4)), (Object)dynamic2)).remove("Village")))));
        }), this.fixTypeEverywhereTyped("NewVillageStartFix", type2, typed5 -> typed5.update(DSL.remainderFinder(), dynamic5 -> dynamic5.update("id", dynamic6 -> Objects.equals(Class5174.method16141(dynamic6.asString("")), "minecraft:new_village") ? dynamic6.createString("minecraft:village") : dynamic6))));
    }
}
