// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8459 extends DataFix
{
    private static final int[][] field34733;
    
    public Class8459(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    private Dynamic<?> method28232(Dynamic<?> set, final boolean b, final boolean b2) {
        if (b || b2) {
            if (!set.get("Facing").asNumber().isPresent()) {
                int n;
                Dynamic dynamic;
                if (!set.get("Direction").asNumber().isPresent()) {
                    n = set.get("Dir").asByte((byte)0) % Class8459.field34733.length;
                    dynamic = set.remove("Dir");
                }
                else {
                    n = set.get("Direction").asByte((byte)0) % Class8459.field34733.length;
                    final int[] array = Class8459.field34733[n];
                    final Dynamic set2 = set.set("TileX", set.createInt(set.get("TileX").asInt(0) + array[0]));
                    final Dynamic set3 = set2.set("TileY", set2.createInt(set2.get("TileY").asInt(0) + array[1]));
                    dynamic = set3.set("TileZ", set3.createInt(set3.get("TileZ").asInt(0) + array[2])).remove("Direction");
                    if (b2) {
                        if (dynamic.get("ItemRotation").asNumber().isPresent()) {
                            dynamic = dynamic.set("ItemRotation", dynamic.createByte((byte)(dynamic.get("ItemRotation").asByte((byte)0) * 2)));
                        }
                    }
                }
                set = dynamic.set("Facing", dynamic.createByte((byte)n));
            }
        }
        return set;
    }
    
    public TypeRewriteRule makeRule() {
        DSL.namedChoice("Painting", this.getInputSchema().getChoiceType(Class9451.field40626, "Painting"));
        DSL.namedChoice("ItemFrame", this.getInputSchema().getChoiceType(Class9451.field40626, "ItemFrame"));
        final Type type = this.getInputSchema().getType(Class9451.field40626);
        return TypeRewriteRule.seq(this.fixTypeEverywhereTyped("EntityPaintingFix", type, typed -> typed.updateTyped(opticFinder, type2, typed2 -> typed2.update(DSL.remainderFinder(), dynamic -> this.method28232(dynamic, true, false)))), this.fixTypeEverywhereTyped("EntityItemFrameFix", type, typed3 -> typed3.updateTyped(opticFinder2, type3, typed4 -> typed4.update(DSL.remainderFinder(), dynamic2 -> this.method28232(dynamic2, false, true)))));
    }
    
    static {
        field34733 = new int[][] { { 0, 0, 1 }, { -1, 0, 0 }, { 0, 0, -1 }, { 1, 0, 0 } };
    }
}
