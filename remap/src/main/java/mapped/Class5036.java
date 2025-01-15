// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.Type;
import java.util.Optional;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class5036 extends Class5035
{
    public Class5036(final Schema schema, final boolean b) {
        super("EntityHorseSplitFix", schema, b);
    }
    
    @Override
    public Pair<String, Typed<?>> method15324(final String b, final Typed<?> typed) {
        final Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
        if (Objects.equals("EntityHorse", b)) {
            String s = null;
            switch (dynamic.get("Type").asInt(0)) {
                default: {
                    s = "Horse";
                    break;
                }
                case 1: {
                    s = "Donkey";
                    break;
                }
                case 2: {
                    s = "Mule";
                    break;
                }
                case 3: {
                    s = "ZombieHorse";
                    break;
                }
                case 4: {
                    s = "SkeletonHorse";
                    break;
                }
            }
            dynamic.remove("Type");
            return (Pair<String, Typed<?>>)Pair.of((Object)s, ((Optional)((Type)this.getOutputSchema().findChoiceType(Class9451.field40626).types().get(s)).readTyped(typed.write()).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse the new horse")));
        }
        return (Pair<String, Typed<?>>)Pair.of((Object)b, (Object)typed);
    }
}
