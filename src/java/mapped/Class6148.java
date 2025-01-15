// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.List$ListType;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class6148 extends Class6132
{
    public Class6148(final Schema schema, final boolean b) {
        super(schema, b, "Villager trade fix", Class9451.field40626, "minecraft:villager");
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        final OpticFinder field = typed.getType().findField("Offers");
        final Type type = field.type().findField("Recipes").type();
        if (type instanceof List$ListType) {
            ((List$ListType)type).getElement();
            return (Typed<?>)typed.updateTyped(field, typed2 -> {
                final Type type2;
                DSL.typeFinder(type2);
                type2.findField("buy");
                final Object o2 = p1 -> {};
                type2.findField("buyB");
                type2.findField("sell");
                return typed2.updateTyped(opticFinder, typed3 -> typed3.updateTyped(opticFinder2, typed4 -> typed4.updateTyped(opticFinder3, function).updateTyped(opticFinder4, function).updateTyped(opticFinder5, function)));
            });
        }
        throw new IllegalStateException("Recipes are expected to be a list.");
    }
    
    private Typed<?> method18379(final OpticFinder<Pair<String, String>> opticFinder, final Typed<?> typed) {
        return (Typed<?>)typed.update((OpticFinder)opticFinder, pair -> pair.mapSecond(a -> Objects.equals(a, "minecraft:carved_pumpkin") ? "minecraft:pumpkin" : a));
    }
}
