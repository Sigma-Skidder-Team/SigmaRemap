// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8629 extends DataFix
{
    public Class8629(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ChunkLightRemoveFix", this.getInputSchema().getType(Class9451.field40613), this.getOutputSchema().getType(Class9451.field40613), typed -> {
            final Type type;
            DSL.fieldFinder("Level", type.findFieldType("Level"));
            return typed.updateTyped(opticFinder, typed2 -> typed2.update(DSL.remainderFinder(), dynamic -> dynamic.remove("isLightOn")));
        });
    }
}
