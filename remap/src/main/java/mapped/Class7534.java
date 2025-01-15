// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public abstract class Class7534 extends DataFix
{
    private final String field29915;
    
    public Class7534(final Schema schema, final String field29915) {
        super(schema, false);
        this.field29915 = field29915;
    }
    
    public TypeRewriteRule makeRule() {
        final Type named = DSL.named(Class9451.field40628.typeName(), DSL.namespacedString());
        if (Objects.equals(this.getInputSchema().getType(Class9451.field40628), named)) {
            return this.fixTypeEverywhere(this.field29915, named, p0 -> pair -> pair.mapSecond((Function)this::method23612));
        }
        throw new IllegalStateException("item name type is not what was expected.");
    }
    
    public abstract String method23612(final String p0);
    
    public static DataFix method23613(final Schema schema, final String s, final Function<String, String> function) {
        return new Class7535(schema, s, function);
    }
}
