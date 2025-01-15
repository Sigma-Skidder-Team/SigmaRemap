// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class5345 extends DataFix
{
    public Class5345(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type type = this.getOutputSchema().getType(Class9451.field40617);
        final Type type2 = this.getInputSchema().getType(Class9451.field40617);
        type2.findField("stats");
        return this.fixTypeEverywhereTyped("SwimStatsRenameFix", type2, type, typed -> {
            final OpticFinder opticFinder2;
            opticFinder2.type().findField("minecraft:custom");
            DSL.namespacedString().finder();
            return typed.updateTyped(opticFinder, typed2 -> typed2.updateTyped(opticFinder3, typed3 -> typed3.update(opticFinder4, s -> {
                if (!s.equals("minecraft:swim_one_cm")) {
                    return s.equals("minecraft:dive_one_cm") ? "minecraft:walk_under_water_one_cm" : s;
                }
                else {
                    return "minecraft:walk_on_water_one_cm";
                }
            })));
        });
    }
}
