// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.templates.List$ListType;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8873 extends DataFix
{
    private static final int[] field37301;
    
    public static int method31183(final int n) {
        return Class8873.field37301[Class9546.method35651(n - 1, 0, Class8873.field37301.length - 1)];
    }
    
    public Class8873(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type choiceType = this.getInputSchema().getChoiceType(Class9451.field40626, "minecraft:villager");
        DSL.namedChoice("minecraft:villager", choiceType);
        choiceType.findField("Offers").type().findField("Recipes");
        return this.fixTypeEverywhereTyped("Villager level and xp rebuild", this.getInputSchema().getType(Class9451.field40626), typed -> {
            final OpticFinder opticFinder2;
            ((List$ListType)opticFinder2.type()).getElement().finder();
            return typed.updateTyped(opticFinder, type, typed2 -> {
                final Dynamic dynamic = (Dynamic)typed2.get(DSL.remainderFinder());
                dynamic.get("VillagerData").get("level").asNumber().orElse(0).intValue();
                final int n;
                Typed<?> typed3 = null;
                if (n == 0 || n == 1) {
                    Class9546.method35651(typed2.getOptionalTyped(opticFinder3).flatMap(typed4 -> typed4.getOptionalTyped(opticFinder4)).map(typed5 -> typed5.getAllTyped(opticFinder5).size()).orElse(0) / 2, 1, 5);
                    if (n > 1) {
                        typed3 = method31184((Typed<?>)typed2, n);
                    }
                }
                if (!dynamic.get("Xp").asNumber().isPresent()) {
                    typed3 = method31185(typed3, n);
                }
                return typed3;
            });
        });
    }
    
    private static Typed<?> method31184(final Typed<?> typed, final int n) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("VillagerData", dynamic2 -> dynamic2.set("level", dynamic2.createInt(n2))));
    }
    
    private static Typed<?> method31185(final Typed<?> typed, final int n) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), dynamic -> {
            method31183(n3);
            return dynamic.set("Xp", dynamic.createInt(n2));
        });
    }
    
    static {
        field37301 = new int[] { 0, 10, 50, 100, 150 };
    }
}
