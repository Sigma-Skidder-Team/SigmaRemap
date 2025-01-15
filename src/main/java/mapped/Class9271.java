// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class9271 extends DataFix
{
    public Class9271(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ChunkStatusFix", this.getInputSchema().getType(Class9451.field40613), this.getOutputSchema().getType(Class9451.field40613), typed -> {
            final Type type;
            DSL.fieldFinder("Level", type.findFieldType("Level"));
            return typed.updateTyped(opticFinder, typed2 -> {
                Dynamic set = (Dynamic)typed2.get(DSL.remainderFinder());
                if (!(!Objects.equals(set.get("Status").asString("empty"), "postprocessed"))) {
                    set = set.set("Status", set.createString("fullchunk"));
                }
                return typed2.set(DSL.remainderFinder(), (Object)set);
            });
        });
    }
}
