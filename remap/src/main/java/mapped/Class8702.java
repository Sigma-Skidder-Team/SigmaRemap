// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8702 extends DataFix
{
    public Class8702(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type named = DSL.named(Class9451.field40620.typeName(), DSL.remainderType());
        if (Objects.equals(named, this.getInputSchema().getType(Class9451.field40620))) {
            return this.fixTypeEverywhere("POI rebuild", named, p0 -> pair -> pair.mapSecond((Function)Class8702::method29855));
        }
        throw new IllegalStateException("Poi type is not what was expected.");
    }
    
    private static <T> Dynamic<T> method29855(final Dynamic<T> dynamic) {
        return dynamic.update("Sections", dynamic2 -> dynamic2.updateMapValues(pair -> pair.mapSecond(dynamic3 -> dynamic3.remove("Valid"))));
    }
}
