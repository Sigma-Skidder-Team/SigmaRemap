// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import com.mojang.datafixers.DataFix;

public class Class9160 extends DataFix
{
    private static final Map<String, String> field38820;
    
    public Class9160(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ChunkStatusFix2", this.getInputSchema().getType(Class9451.field40613), this.getOutputSchema().getType(Class9451.field40613), typed -> {
            final Type type;
            DSL.fieldFinder("Level", type.findFieldType("Level"));
            return typed.updateTyped(opticFinder, typed2 -> {
                final Dynamic dynamic = (Dynamic)typed2.get(DSL.remainderFinder());
                dynamic.get("Status").asString("empty");
                final String s;
                final String b = Class9160.field38820.getOrDefault(s, "empty");
                return Objects.equals(s, b) ? typed2 : typed2.set(DSL.remainderFinder(), (Object)dynamic.set("Status", dynamic.createString(b)));
            });
        });
    }
    
    static {
        field38820 = (Map)ImmutableMap.builder().put((Object)"structure_references", (Object)Class9160.\uade7\uc61b\uc85a\ud4d3\u3122\u3f9b[3]).put((Object)"biomes", (Object)Class9160.\uade7\uc61b\uc85a\ud4d3\u3122\u3f9b[3]).put((Object)"base", (Object)"surface").put((Object)"carved", (Object)"carvers").put((Object)"liquid_carved", (Object)"liquid_carvers").put((Object)"decorated", (Object)"features").put((Object)"lighted", (Object)"light").put((Object)"mobs_spawned", (Object)"spawn").put((Object)"finalized", (Object)"heightmaps").put((Object)"fullchunk", (Object)"full").build();
    }
}
