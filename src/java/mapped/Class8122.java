// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8122 extends DataFix
{
    public static final String[] field33460;
    
    public Class8122(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type type = this.getInputSchema().getType(Class9451.field40622);
        DSL.fieldFinder("id", DSL.named(Class9451.field40628.typeName(), DSL.namespacedString()));
        type.findField("tag");
        return this.fixTypeEverywhereTyped("ItemShulkerBoxColorFix", type, typed -> {
            final OpticFinder opticFinder4;
            opticFinder4.type().findField("BlockEntityTag");
            typed.getOptional(opticFinder);
            final Optional optional;
            if (!(!optional.isPresent())) {
                if (!(!Objects.equals(optional.get().getSecond(), "minecraft:shulker_box"))) {
                    typed.getOptionalTyped(opticFinder2);
                    final Optional optional2;
                    if (!(!optional2.isPresent())) {
                        final Typed typed2 = optional2.get();
                        typed2.getOptionalTyped(opticFinder3);
                        final Optional optional3;
                        if (!(!optional3.isPresent())) {
                            final Typed typed3 = optional3.get();
                            final Dynamic dynamic = (Dynamic)typed3.get(DSL.remainderFinder());
                            dynamic.get("Color").asInt(0);
                            dynamic.remove("Color");
                            final int n;
                            return typed.set(opticFinder2, typed2.set(opticFinder3, typed3.set(DSL.remainderFinder(), (Object)dynamic))).set(opticFinder, (Object)Pair.of((Object)Class9451.field40628.typeName(), (Object)Class8122.field33460[n % 16]));
                        }
                    }
                }
            }
            return typed;
        });
    }
    
    static {
        field33460 = new String[] { "minecraft:white_shulker_box", "minecraft:orange_shulker_box", "minecraft:magenta_shulker_box", "minecraft:light_blue_shulker_box", "minecraft:yellow_shulker_box", "minecraft:lime_shulker_box", "minecraft:pink_shulker_box", "minecraft:gray_shulker_box", "minecraft:silver_shulker_box", "minecraft:cyan_shulker_box", "minecraft:purple_shulker_box", "minecraft:blue_shulker_box", "minecraft:brown_shulker_box", "minecraft:green_shulker_box", "minecraft:red_shulker_box", "minecraft:black_shulker_box" };
    }
}
