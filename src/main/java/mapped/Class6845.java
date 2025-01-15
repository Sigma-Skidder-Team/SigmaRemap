// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.function.Function;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.types.Type;
import java.util.Optional;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Dynamic;
import java.util.function.Supplier;
import com.mojang.datafixers.Typed;
import java.util.Objects;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.List;
import com.mojang.datafixers.DataFix;

public class Class6845 extends DataFix
{
    private static final List<String> field26862;
    
    public Class6845(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhere("EntityMinecartIdentifiersFix", (Type)this.getInputSchema().findChoiceType(Class9451.field40626), (Type)this.getOutputSchema().findChoiceType(Class9451.field40626), p2 -> pair -> {
            if (Objects.equals(pair.getFirst(), "Minecart")) {
                final Typed typed = taggedChoice$TaggedChoiceType.point(dynamicOps, (Object)"Minecart", pair.getSecond()).orElseThrow(IllegalStateException::new);
                ((Dynamic)typed.getOrCreate(DSL.remainderFinder())).get("Type").asInt(0);
                final int n;
                String s;
                if (n > 0 && n < Class6845.field26862.size()) {
                    s = Class6845.field26862.get(n);
                }
                else {
                    s = "MinecartRideable";
                }
                return Pair.of((Object)s, ((Optional)((Type)taggedChoice$TaggedChoiceType2.types().get(s)).read(typed.write()).getSecond()).orElseThrow(() -> new IllegalStateException("Could not read the new minecart.")));
            }
            else {
                return pair;
            }
        });
    }
    
    static {
        field26862 = Lists.newArrayList((Object[])new String[] { Class6845.\u7074\u7d3f\uff74\u430d\ua592\u35ef[3], "MinecartChest", "MinecartFurnace" });
    }
}
